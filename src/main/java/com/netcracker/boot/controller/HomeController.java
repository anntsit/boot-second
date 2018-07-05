package com.netcracker.boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {


    RestTemplate restTemplate = new RestTemplate();
    String fooResourceUrl
            = "http://localhost:8080/spring-rest/foos";

    @RequestMapping(value = "/response", method = RequestMethod.GET)
    public String index() {
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
        return "ok";
    }
}
