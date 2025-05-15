package com.myapi.myapi.contrller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @GetMapping("/Sources")
    public String source() {

        return "Hello this is my first api";
    }


}
