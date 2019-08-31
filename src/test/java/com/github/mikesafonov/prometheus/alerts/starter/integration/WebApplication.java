package com.github.mikesafonov.prometheus.alerts.starter.integration;

import com.github.mikesafonov.prometheus.alerts.starter.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class WebApplication {
    @Bean
    @Profile("service")
    public NotificationService notificationService() {
        return System.out::println;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }
}
