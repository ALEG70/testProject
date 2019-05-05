package oleg.larionov.utils;

import oleg.larionov.models.Car;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {

    @Override
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {
        Car car = new Car();
        car.setId(resultSet.getInt("id_car"));
        car.setMaker(resultSet.getString("maker"));
        car.setModel(resultSet.getString("model"));
        car.setLicense_plate(resultSet.getString("license_plate"));
        car.setId_owner(resultSet.getInt("owner_id"));
        car.setOwner(new OwnerMapper().mapRow(resultSet, i));
        return car;
    }
}
