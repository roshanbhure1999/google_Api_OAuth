package com.apptware.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController

public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping
    public String signIn() {
        return "Welcome to OAuthDemoApp !!";
    }

    @GetMapping("/get-info")
    public Principal user(Principal principal) {
        logger.info(principal.getName().formatted("username : %s"));
        return principal;

    }

}
