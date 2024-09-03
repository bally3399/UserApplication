package africa.semicolon.com.userapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello Josh Have done the classwork";
    }
}
