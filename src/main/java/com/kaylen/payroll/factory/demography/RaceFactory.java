package com.kaylen.payroll.factory.demography;

import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.util.Misc;

public class RaceFactory {

    public static Race getRace(String raceType) {
        return new Race.Builder().raceID(Misc.generateId())
                .raceType(raceType)
                .build();
    }
}
