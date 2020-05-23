package com.se.oem.alert.repository;

import com.se.oem.alert.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AlertRepository extends JpaRepository<Alert, UUID> {

    List<Alert> findByHost(String host);

    @Query(value = "SELECT c.PHONE FROM CUSTOMER C, HOST H where c.id=h.customer_id AND H.hostname = ?", nativeQuery = true)
    String findPhoneByHost(String host);


}
