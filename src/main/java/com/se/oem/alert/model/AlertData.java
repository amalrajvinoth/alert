package com.se.oem.alert.model;

import lombok.*;

@Getter
@Setter
@ToString
public class AlertData {
    private String severity;
    private String host;
    private String metric;
    private String message;
    private String keyValueName;
    private String ruleName;
    private String ruleOwner;
    private String targetUrl;
    private String targetType;
    private String targetVersion;
    private String targetLifeCycleStatus;
    private String notificationType;
    private String eventReportedTime;
    private String metricGroup;
}
