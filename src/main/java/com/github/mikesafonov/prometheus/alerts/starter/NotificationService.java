package com.github.mikesafonov.prometheus.alerts.starter;

import com.github.mikesafonov.prometheus.alerts.starter.dto.AlertManagerNotification;

public interface NotificationService {

    void sendNotification(AlertManagerNotification notification);
}
