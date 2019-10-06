# spring-boot-starter-prometheus-alerts
[![Maven Central](https://img.shields.io/maven-central/v/com.github.mikesafonov/spring-boot-starter-prometheus-alerts.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.mikesafonov%22%20AND%20a:%22spring-boot-starter-prometheus-alerts%22)
[![codecov](https://codecov.io/gh/MikeSafonov/spring-boot-starter-prometheus-alerts/branch/master/graph/badge.svg)](https://codecov.io/gh/MikeSafonov/spring-boot-starter-prometheus-alerts)
![Travis-CI](https://travis-ci.com/MikeSafonov/spring-boot-starter-prometheus-alerts.svg?branch=master)
[![Conventional Commits](https://img.shields.io/badge/Conventional%20Commits-1.0.0-yellow.svg)](https://conventionalcommits.org)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=alert_status)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=security_rating)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=bugs)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=code_smells)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)

[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=ncloc)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=MikeSafonov_spring-boot-starter-prometheus-alerts&metric=sqale_index)](https://sonarcloud.io/dashboard?id=MikeSafonov_spring-boot-starter-prometheus-alerts)

This is a starter for spring boot application witch catch alerts from [Prometheus Alertmanager](https://prometheus.io/docs/alerting/alertmanager/).

The starter is available at `https://repo1.maven.org/maven2/` repository.

Using gradle: 
    
    repositories {
        maven {url "https://repo1.maven.org/maven2/"}
    }
    dependencies {
        implementation 'com.github.mikesafonov:spring-boot-starter-prometheus-alerts:1.0.0'
    }

The only thing you need to do after adding the dependency is to create a bean with implementation of `NotificationService` interface:

    @Serivce
    public class MyNotificationService implementation NotificationService {
    ...
    } 

## Configuration

The following properties can be configured:

| property | description |
| -------- | ----------- |
| prometheus.alertmanager.endpoint.base | base url for POST request mapping for prometheus alert (default `/alert`) |
    
## Build

### Build from source

You can build application using following command:

    ./gradlew clean build -x signArchives
    
#### Requirements:

JDK >= 1.8

### Unit tests

You can run unit tests using following command:

    ./gradlew test

### Alertmanager configuration

```
route:
  receiver: 'my-application'
receivers:
- name: 'my-application'
  webhook_configs:
    - url: http://<application-host>:<application-port>/alert
```

## Usage example

- [prometheus-telegram-alert](https://github.com/MikeSafonov/prometheus-telegram-alert)

## Contributing

Feel free to contribute. 
New feature proposals and bug fixes should be submitted as GitHub pull requests. 
Fork the repository on GitHub, prepare your change on your forked copy, and submit a pull request.

**IMPORTANT!**
>Before contributing please read about [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0-beta.2/) / [Conventional Commits RU](https://www.conventionalcommits.org/ru/v1.0.0-beta.2/)