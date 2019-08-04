package com.kaylen.payroll.factory.demography;

import com.kaylen.payroll.domain.demography.Gender;

public class GenderFactory {

    public static Gender getGender(String employeeNumber, String genderType) {
        return new Gender.Builder().employeeNumber(employeeNumber)
                .genderType(genderType)
                .build();
    }
}
