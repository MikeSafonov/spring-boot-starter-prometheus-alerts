package com.github.mikesafonov.prometheus.alerts.starter;


import com.github.mikesafonov.prometheus.alerts.starter.dto.AlertManagerNotification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MikeSafonov
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("${prometheus.alertmanager.endpoint.base:/alert}")
public class AlertEndpoint {
    private final NotificationService notificationService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void alert(@RequestBody AlertManagerNotification managerNotification) {
        log.debug("Notification: {}",managerNotification);
        notificationService.onNotification(managerNotification);
    }
}
