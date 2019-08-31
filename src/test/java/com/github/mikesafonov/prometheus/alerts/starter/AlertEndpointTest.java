package com.github.mikesafonov.prometheus.alerts.starter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class AlertEndpointTest {
    @Test
    void doesNotCreateAlertControllerBecauseNoWebApplication() {
        ApplicationContextRunner contextRunner = new ApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(AlertManagerAutoConfiguration.class));
        contextRunner.run((context) -> assertThat(context).doesNotHaveBean(AlertEndpoint.class));
    }

    @Test
    void doesNotCreateAlertControllerBecauseNoNotificationService() {
        WebApplicationContextRunner contextRunner = new WebApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(AlertManagerAutoConfiguration.class));
        contextRunner.run((context) -> assertThat(context).doesNotHaveBean(AlertEndpoint.class));
    }

    @Test
    void createAlertController() {
        WebApplicationContextRunner contextRunner = new WebApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(AlertManagerAutoConfiguration.class))
                .withUserConfiguration(TestConfiguration.class);
        contextRunner.run((context) -> assertThat(context).hasSingleBean(AlertEndpoint.class));
    }
}
