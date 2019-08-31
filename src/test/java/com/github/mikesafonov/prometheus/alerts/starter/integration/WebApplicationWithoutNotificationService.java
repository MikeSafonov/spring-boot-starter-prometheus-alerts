package com.github.mikesafonov.prometheus.alerts.starter.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplicationWithoutNotificationService {
    public static void main(String[] args) {
        SpringApplication.run(WebApplicationWithoutNotificationService.class);
    }
}
