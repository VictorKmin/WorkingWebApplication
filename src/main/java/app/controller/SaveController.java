package app.controller;


import app.entity.User;
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

    @PostMapping("/user")
    public String saveUser(User user) {
        userService.save(user);
        return "index";
    }
}




