package com.perry.spring.uber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FleetLocationServiceApplication {
    public static void main(String[] args) {
//        System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");
        SpringApplication.run(FleetLocationServiceApplication.class, args);
    }
}
