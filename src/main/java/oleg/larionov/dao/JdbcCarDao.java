package oleg.larionov.dao;

import oleg.larionov.models.Car;
import oleg.larionov.utils.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class JdbcCarDao extends JdbcTemplateMain implements CarDao{

    @Override
    public Car findById(Integer id_car){
        String SQL = "SELECT * FROM cars JOIN owners ON cars.owner_id = owners.id_owner AND cars.id_car=?";
        return jdbcTemplate.queryForObject(SQL,new Object[]{id_car}, new CarMapper());
    }

    @Override
    public List<Car> findWithParameters(Integer id, String maker, Integer id_owner) {
        final String SQL = "SELECT * FROM cars join owners on cars.owner_id = owners.id_owner WHERE id_car LIKE ? " +
                "                     AND maker LIKE ? " +
                "                     AND owner_id LIKE ? ORDER BY cars.id_car";
        Object [] parameters = {
                id == null ? "%" : id+"%",
                maker+"%",
                id_owner == null ? "%" : id_owner+"%"
        };
        return jdbcTemplate.query(SQL,parameters, new CarMapper());
    }

    @Override
    public List<Car> findAll() {
        final String SQL = "SELECT * FROM cars join owners on cars.owner_id = owners.id_owner ORDER BY cars.id_car";
        return jdbcTemplate.query(SQL, new CarMapper());
    }

}
