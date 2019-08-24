package com.github.mikesafonov.prometheus.alerts.starter;


import com.github.mikesafonov.prometheus.alerts.starter.dto.AlertManagerNotification;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MikeSafonov
 */
@ConditionalOnBean(NotificationService.class)
@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("${prometheus.alertmanager.alert.base:/alert}")
public class AlertController {
    private final NotificationService notificationService;

    @PostMapping
    public void alert(@RequestBody AlertManagerNotification managerNotification) {
        log.debug("Notification: {}",managerNotification);
        notificationService.sendNotification(managerNotification);
    }
}
