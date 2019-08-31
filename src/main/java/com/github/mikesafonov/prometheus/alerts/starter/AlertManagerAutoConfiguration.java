package com.github.mikesafonov.prometheus.alerts.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@ConditionalOnBean(NotificationService.class)
public class AlertManagerAutoConfiguration {

    @Bean
    public AlertEndpoint alertEndpoint(NotificationService notificationService) {
        return new AlertEndpoint(notificationService);
    }
}