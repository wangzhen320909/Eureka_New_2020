package com.eurekaserver.serverfirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerFirestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerFirestApplication.class, args);
    }

}
