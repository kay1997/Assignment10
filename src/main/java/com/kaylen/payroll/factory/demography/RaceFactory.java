package com.kaylen.payroll.factory.demography;

import com.kaylen.payroll.domain.demography.Race;

public class RaceFactory {

    public static Race getRace(String employeeNumber, String raceType) {
        return new Race.Builder().employeeNumber(employeeNumber)
                .raceType(raceType)
                .build();
    }
}
