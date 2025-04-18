package dev.avanish.buildresume.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/edit")
    public String edit(){
        return "edit page";
    }
}
