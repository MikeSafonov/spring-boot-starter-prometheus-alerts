package com.github.mikesafonov.prometheus.alerts.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    @Bean
    public NotificationService notificationService(){
        return System.out::println;
    }
}
