package com.example.compound_interest_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient   // 👈 ADD THIS LINE
public class CompoundInterestMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompoundInterestMicroserviceApplication.class, args);
    }
}