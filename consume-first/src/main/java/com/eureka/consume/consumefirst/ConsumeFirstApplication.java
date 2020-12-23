package com.eureka.consume.consumefirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumeFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeFirstApplication.class, args);
    }

}
