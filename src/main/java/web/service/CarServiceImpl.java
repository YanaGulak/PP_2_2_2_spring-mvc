package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> allCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Renault Duster", "brown", 121));
        cars.add(new Car("Toyota Land Cruiser", "black", 515));
        cars.add(new Car("BMW X7", "white", 959));
        cars.add(new Car("Mercedes-Benz GLE", "red", 112));
        cars.add(new Car("Toyota RAV4", "navy blue", 710));
        return cars;
    }


    @Override
    public List<Car> getCarFromListAndCount(List<Car> cars, Integer count) {
        if (count == null) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
