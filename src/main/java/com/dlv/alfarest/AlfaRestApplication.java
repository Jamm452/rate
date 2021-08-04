package com.dlv.alfarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.dlv.alfarest.service")
public class AlfaRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlfaRestApplication.class, args);
    }
}