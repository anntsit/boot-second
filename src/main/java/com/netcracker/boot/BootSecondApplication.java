package com.netcracker.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.Console;
import java.util.logging.Logger;

@SpringBootApplication
public class BootSecondApplication {


    public static void main(String[] args) {
        SpringApplication.run(BootSecondApplication.class, args);
        String BOOT_FIRST_URL
                = "http://localhost:8080/response";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(BOOT_FIRST_URL , String.class);
        response.getBody().toString();
    }
}
