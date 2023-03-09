package com.example.poc.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomePageController {



    @GetMapping("/home")
    public String hopePage(HttpServletRequest httpServletRequest){

        return "hello world";
    }
}
