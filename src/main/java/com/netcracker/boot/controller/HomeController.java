package com.netcracker.boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {


    RestTemplate restTemplate = new RestTemplate();
    final String BOOT_FIRST_URL
            = "http://boot-first:8080";

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String index() {
        ResponseEntity<String> response
                = restTemplate.getForEntity(BOOT_FIRST_URL , String.class);
        return response.getBody().toString();
    }
}
