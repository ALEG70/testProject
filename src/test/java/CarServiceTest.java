import oleg.larionov.dao.JdbcCarDao;
import oleg.larionov.models.Car;
import oleg.larionov.services.CarService;
import org.junit.Test;
import org.junit.Before;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.ui.ExtendedModelMap;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarServiceTest {
    private final List<Car> CARS = new ArrayList<>();
    private final Car car = new Car();

    @Before
    public void initCars(){
        car.setId(1);
        car.setMaker("volvo");
        car.setModel("740GL");
        car.setId_owner(1);
        CARS.add(car);
    }

    @Test
    public void testCarService(){
        JdbcCarDao jdbcCarDao = mock(JdbcCarDao.class);
        when(jdbcCarDao.findById(1)).thenReturn(car);

        CarService carService = new CarService();
        ReflectionTestUtils.setField(carService, "carDao", jdbcCarDao);
        ExtendedModelMap uiModel = new ExtendedModelMap();
        uiModel.addAttribute("car", carService.findById(1));

        Car auto = (Car)uiModel.get("car");
        assertEquals(1, auto.getId());
        assertEquals(1, car.getId_owner());
    }
}
