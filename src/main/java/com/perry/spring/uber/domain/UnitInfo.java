package com.perry.spring.uber.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data // generate getter and setter
@RequiredArgsConstructor // final data member constructor
@AllArgsConstructor // all data member constructor
@Embeddable //
public class UnitInfo {

    private final String unitVin;
    private String engineMake;
    private String customerName;
    private String unitNumber;
    private String runningId;

    private UnitInfo() {
        this.unitVin = "";
    }

}
