package oleg.larionov.services;

import oleg.larionov.dao.CarDao;
import oleg.larionov.dao.JdbcCarDao;
import oleg.larionov.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {

    public List<Car> findWithParam(Integer id, String maker, Integer id_owner){

        return carDao.findWithParameters(id, maker, id_owner);
    }

    public List<Car> findAll(){

        return carDao.findAll();
    }

    public Car findById(Integer id_car){

        return carDao.findById(id_car);
    }

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    private CarDao carDao;
}


