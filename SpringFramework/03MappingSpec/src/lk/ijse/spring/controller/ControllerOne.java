package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")

public class ControllerOne {
    @GetMapping
    public void testOne(){
        System.out.println("Get mapping Invoked");
    }
}
