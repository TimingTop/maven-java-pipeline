package com.timing.xsystem.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class HealthCheckController {


    @RequestMapping(value = "/health-check", method = RequestMethod.GET)
    public String check() {
        return "hello.";
    }

}
