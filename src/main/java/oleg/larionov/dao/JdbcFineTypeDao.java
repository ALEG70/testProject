package oleg.larionov.dao;

import oleg.larionov.models.FineType;
import oleg.larionov.utils.FineTypeMapper;
import oleg.larionov.utils.FineTypeSpecMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class JdbcFineTypeDao extends JdbcTemplateMain implements FineTypeDao{

    public List<FineType> findAll() {

        final String SQL = "SELECT * FROM fine_types";
        return jdbcTemplate.query(SQL, new FineTypeMapper());
    }

    public List<FineType> topFines(Integer limit) {

        final String SQL = "SELECT * FROM (SELECT type_id, COUNT(id_fine) ctr " +
                "FROM fines GROUP BY type_id ORDER BY ctr DESC LIMIT ?) c " +
                "JOIN fine_types ON c.type_id=fine_types.id_ft";
        return jdbcTemplate.query(SQL,new Object[]{limit}, new FineTypeSpecMapper());
    }
}
