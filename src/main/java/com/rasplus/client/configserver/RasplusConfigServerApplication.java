package com.rasplus.client.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RasplusConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RasplusConfigServerApplication.class, args);
    }

}
