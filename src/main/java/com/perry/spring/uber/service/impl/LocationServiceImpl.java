package com.perry.spring.uber.service.impl;

import com.perry.spring.uber.domain.Location;
import com.perry.spring.uber.domain.LocationRepository;
import com.perry.spring.uber.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // AOP: form bean, and let service know this bean is from service layer
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> saveCarLocation(List<Location> carLocations) {
        return (List<Location>)locationRepository.save(carLocations); // Implemented by JPA
    }

    public void deleteAll() {
        this.locationRepository.deleteAll();
    }

    public Page<Location> findByVehicleMovementType(String movementType, Pageable pageable) {
        return this.locationRepository.findByVehicleMovementType(Location.VehicleMovementType.valueOf(movementType), pageable);
    }

    public Page<Location> findByVin(String vin, Pageable pageable) {
        return locationRepository.findByUnitInfoUnitVin(vin, pageable);
    }
}
