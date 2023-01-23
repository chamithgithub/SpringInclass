package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")

public class ControllerOne {
    @GetMapping
    public void testOne(){
        System.out.println("Get mapping Invoked");
    }
    @PostMapping
    public void testTwo(){
        System.out.println("Post mapping invoked");
    }

    @DeleteMapping
    public void testThree(){
        System.out.println(" DeleteMapping invoked");
    }
}
