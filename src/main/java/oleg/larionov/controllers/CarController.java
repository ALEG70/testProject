package oleg.larionov.controllers;

import oleg.larionov.models.Car;
import oleg.larionov.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller("carController")
public class CarController extends CoreController{

    @GetMapping({"/cars"})
    public String cars(@RequestParam(value = "id", required = false) Integer id,
                      @RequestParam(value = "maker", required = false, defaultValue = "%") String maker,
                      @RequestParam(value = "id_owner", required = false) Integer id_owner,
                      Model model) {
        List<Car> carsList= carService.findWithParam(id, maker, id_owner);
        model.addAttribute("carsList", carsList);
        return "cars";
    }

    @GetMapping({"/allCars"})
    public String allCars(Model model){
        List<Car> carsList = carService.findAll();
        model.addAttribute("carsList", carsList);
        return "cars";
    }

    @GetMapping({"/car"})
    public String car(@RequestParam(value="id") Integer id_car,
                        Model model){
        Car car = carService.findById(id_car);
        model.addAttribute("car", car);
        return "car";
    }

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    private CarService carService;

}
