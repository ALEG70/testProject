package oleg.larionov.dao;

import oleg.larionov.models.Owner;
import oleg.larionov.utils.OwnerMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class JdbcOwnerDao extends JdbcTemplateMain implements OwnerDao {

    public List<Owner> findAll(){

        final String SQL = "SELECT * FROM owners";
        return (List<Owner>)jdbcTemplate.query(SQL, new OwnerMapper());
    }

    public Owner findById(Integer id_owner){

        String SQL = "SELECT * FROM owners WHERE id_owner=?";
        return (Owner)jdbcTemplate.queryForObject(SQL, new Object[]{id_owner}, new OwnerMapper());
    }
}
