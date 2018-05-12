package app.controller;


import app.entity.Car;
import app.entity.User;
import app.service.carService.CarService;
import app.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/save")
@Controller
public class SaveController {

    @Autowired
    private UserService userService;

    @Autowired
    private CarService carService;

    @PostMapping("/user")
    public String saveUser(User user) {
        userService.save(user);
        return "index";
    }

    @PostMapping("/car")
    public String saveCar(Car car) {
        carService.save(car);
        return "index";
    }
}




