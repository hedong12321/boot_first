package com.hed.boot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Value("${name}")
    private String name;

    @RequestMapping("/doLogin")
    public String doLogin() {
        return "welcome use this system!" + " your name is " + name + "...";
    }

}
