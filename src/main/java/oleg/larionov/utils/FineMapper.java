package oleg.larionov.utils;

import oleg.larionov.models.Fine;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FineMapper implements RowMapper {

    @Override
    public Fine mapRow(ResultSet resultSet, int i) throws SQLException {

        Fine fine = new Fine();
        fine.setId_fine(resultSet.getInt("id_fine"));
        fine.setId_car(resultSet.getInt("car_id"));
        fine.setId_type(resultSet.getInt("type_id"));
        fine.setCar(new CarMapper().mapRow(resultSet, i));
        fine.setType(new FineTypeMapper().mapRow(resultSet, i));
        return fine;
    }
}
