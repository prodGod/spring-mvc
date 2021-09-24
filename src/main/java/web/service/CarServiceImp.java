package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{

    private List<Car> carList = new ArrayList<Car>(); {


        carList.add( new Car("Toyota","Corona",10993));
        carList.add(new Car("VAZ","2107",102107));
        carList.add(new Car("Acura","NSX",104545));
        carList.add(new Car("Volvo","XC 90",134679));
        carList.add(new Car("Suzuki","Samurai",13333493));
    }


    @Override
    public List<Car> carList(Integer count) {

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}