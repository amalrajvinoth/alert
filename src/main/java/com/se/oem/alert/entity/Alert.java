package com.se.oem.alert.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Data
@Entity
@Builder
@Table(name = "alert")
@NoArgsConstructor
@AllArgsConstructor
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "host")
    private String host;

    @Column(name = "severity")
    private String severity;

    @Column(name = "metric")
    private String metric;

    @Column(name = "message")
    private String message;

    @Column(name = "keyValueName")
    private String keyValueName;

    @Column(name = "ruleName")
    private String ruleName;

    @Column(name = "ruleOwner")
    private String ruleOwner;

    @Column(name = "targetUrl")
    private String targetUrl;

    @Column(name = "targetType")
    private String targetType;

    @Column(name = "targetVersion")
    private String targetVersion;

    @Column(name = "targetLifeCycleStatus")
    private String targetLifeCycleStatus;

    @Column(name = "notificationType")
    private String notificationType;

    @Column(name = "eventReportedTime")
    private String eventReportedTime;
}
