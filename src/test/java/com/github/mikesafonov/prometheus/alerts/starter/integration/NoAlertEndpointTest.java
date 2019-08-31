package com.github.mikesafonov.prometheus.alerts.starter.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NoAlertEndpointTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturn404() throws MalformedURLException {
        URL url = new URL("http://localhost:" + port + "/alert");
        ResponseEntity<Void> responseEntity =
                restTemplate.postForEntity(url.toString(), null, Void.class);

        HttpStatus statusCode = responseEntity.getStatusCode();
        Assertions.assertEquals(404, statusCode.value());
    }

}
