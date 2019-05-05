package oleg.larionov.dao;

import oleg.larionov.models.Car;
import org.springframework.stereotype.Repository;

import java.net.Inet4Address;
import java.util.List;

public interface CarDao {

    List<Car> findAll();

    Car findById(Integer id);

    List<Car> findWithParameters(Integer id_car, String maker, Integer owner);

}
