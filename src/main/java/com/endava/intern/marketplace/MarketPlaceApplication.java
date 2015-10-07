package com.endava.intern.marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MarketPlaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketPlaceApplication.class, args);
    }
}
