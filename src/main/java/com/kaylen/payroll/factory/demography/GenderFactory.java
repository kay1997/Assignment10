package com.kaylen.payroll.factory.demography;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.util.Misc;

public class GenderFactory {

    public static Gender getGender(String genderType) {
        return new Gender.Builder().genderID(Misc.generateId())
                .genderType(genderType)
                .build();
    }
}
