package com.se.oem.alert.service;

import com.se.oem.alert.entity.Alert;
import com.se.oem.alert.model.AlertData;
import com.se.oem.alert.repository.AlertRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class AlertService {

    private final AlertRepository repository;

    public String createAlert(AlertData data) {
        log.info("Received create alert: {}", data);
        Alert alert = new Alert();
        BeanUtils.copyProperties(data, alert);
        return repository.save(alert).getId().toString();
    }

    public void updateAlert(String alertId, AlertData data) {
        log.info("Received update alert for id: {}, data: {}", alertId, data);
        Optional<Alert> alert = repository.findById(UUID.fromString(alertId));
        Alert newAlert = alert.orElseGet(Alert::new);
        BeanUtils.copyProperties(data, newAlert);
        repository.save(newAlert);
    }

    public Alert getAlert(String alertId) {
        log.info("Received get alert for id: {}", alertId);
        return repository.findById(UUID.fromString(alertId)).orElse(null);
    }

    public void deleteAlert(String alertId) {
        log.info("Received delete alert for id: {}", alertId);
        repository.deleteById(UUID.fromString(alertId));
    }
}
