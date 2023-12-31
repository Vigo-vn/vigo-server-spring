package uet.vnu.vigo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uet.vnu.vigo.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public String hello() {
        return userService.hello();
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Integer id) {
        return id.toString();
    }
}
