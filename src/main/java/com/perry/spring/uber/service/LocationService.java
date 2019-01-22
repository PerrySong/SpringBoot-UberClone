package com.perry.spring.uber.service;

import com.perry.spring.uber.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocationService {
    List<Location> saveCarLocation(List<Location> carLocations);

    void deleteAll();

    Page<Location> findByVehicleMovementType(String movementType, Pageable pageable);
    Page<Location> findByVin(String vin, Pageable pageable);
}
