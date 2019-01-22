package com.perry.spring.uber.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface LocationRepository extends JpaRepository<Location, Long> {
    // Location dao, id = long
    Page<Location> findByVehicleMovementType(@Param("movementType") Location.VehicleMovementType movementType, Pageable pageable);
    // @Param: find movementType
    Page<Location> findByUnitInfoUnitVin(@Param("unitVin") String unitVin, Pageable pageable);

    @RestResource(rel = "by-service-type") // Auto generate rest methods
    Page<Location> findByServiceType(@Param("type") String type, Pageable pageable);

}
