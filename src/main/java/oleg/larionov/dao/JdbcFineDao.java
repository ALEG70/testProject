package oleg.larionov.dao;

import oleg.larionov.models.Fine;
import oleg.larionov.utils.FineMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcFineDao extends JdbcTemplateMain implements FineDao{

    public List<Fine> findWithParameters(String sec_name, String license_plate){

        final String SQL = "select * from" +
                "(select * from cars join owners on cars.owner_id = owners.id_owner) co" +
                " join " +
                " (select * from fines join fine_types on fines.type_id=fine_types.id_ft) ft" +
                " on ft.car_id = co.id_car and sec_name LIKE ? AND license_plate LIKE ?";
        Object [] parameters = {
                sec_name+"%",
                license_plate+"%"
        };
        return (List<Fine>)jdbcTemplate.query(SQL, parameters, new FineMapper());
    }

    public List<Fine> findAll(){
        final String SQL = "SELECT * FROM fines";
        return (List<Fine>)jdbcTemplate.query(SQL, new FineMapper());
    }

}
