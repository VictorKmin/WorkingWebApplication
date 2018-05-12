package app.service.carService;

import app.dao.CarDao;
import app.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CarImpl implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }

    @Override
    public void save(Car car) {
        carDao.save(car);
    }
}
