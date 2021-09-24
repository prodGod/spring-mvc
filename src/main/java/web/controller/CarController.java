
package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarServiceImp car;

    public CarController(CarServiceImp car) {
        this.car = car;
    }

    @GetMapping
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model){
        if (count==null){
            count=5;
        }
        model.addAttribute("car", car.carList(count));
        return "cars" ;


    }
}