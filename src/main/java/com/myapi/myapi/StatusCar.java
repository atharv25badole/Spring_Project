package com.myapi.myapi;

import com.myapi.myapi.contrller.CarStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCar {

    @Autowired
    private CarStatus carStatus;

    @GetMapping("/Status")
    public String show(){

        return "Hello this is spring project, and we are going to automate this process";
    }

}
