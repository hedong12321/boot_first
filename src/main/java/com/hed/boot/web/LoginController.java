package com.hed.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/doLogin")
    public String doLogin() {
        return "welcome use this system!";
    }

}
