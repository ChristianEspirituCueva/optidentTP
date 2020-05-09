package com.acme.optident;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OptidentApplication {

    public static void main(String[] args) {
        SpringApplication.run(OptidentApplication.class, args);
    }

}
