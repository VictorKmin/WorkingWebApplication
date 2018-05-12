package app.service.carService;

import app.entity.Car;

import java.util.List;

public interface CarService {

    public List<Car> findAll();
    void save(Car car);
}
