package com.jboard.ota.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class OtaJobBoardApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtaJobBoardApiApplication.class, args);
    }

}
