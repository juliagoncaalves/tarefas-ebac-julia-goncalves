package com.juliagoncalves.memelandia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class MemelandiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemelandiaApplication.class, args);
    }

}