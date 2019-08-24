package com.github.mikesafonov.prometheus.alerts.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;

@ConditionalOnWebApplication
@ConditionalOnBean(NotificationService.class)
public class AlertManagerAutoConfiguration {

    @Bean
    public AlertController alertController(NotificationService notificationService) {
        return new AlertController(notificationService);
    }
}
