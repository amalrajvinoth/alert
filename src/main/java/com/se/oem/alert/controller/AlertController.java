package com.se.oem.alert.controller;

import com.se.oem.alert.entity.Alert;
import com.se.oem.alert.model.AlertData;
import com.se.oem.alert.service.AlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/alerts")
public class AlertController {

    private final AlertService service;

    @PostMapping
    public String creatAlert(@RequestBody AlertData data) {
        return service.createAlert(data);
    }

    @PutMapping("/{alertId}")
    public void updateAlert(@PathVariable("alertId") String alertId, @RequestBody AlertData data) {
        service.updateAlert(alertId, data);
    }

    @GetMapping("/{alertId}")
    public Alert getAlert(@PathVariable("alertId") String alertId) {
        return service.getAlert(alertId);
    }

    @DeleteMapping("/{alertId}")
    public void deleteAlert(@PathVariable("alertId") String alertId) {
        service.deleteAlert(alertId);
    }

}
