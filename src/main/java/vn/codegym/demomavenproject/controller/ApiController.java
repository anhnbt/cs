package vn.codegym.demomavenproject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:63342")
public class ApiController {

    @GetMapping
    public String getUsers() {
        return "Hello World";
    }
}
