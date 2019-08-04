package com.kaylen.payroll.factory.user;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.factory.demography.GenderFactory;
import com.kaylen.payroll.factory.demography.RaceFactory;

public class EmployeeFactory {

    public static Employee getEmployee(String employeeNumber, String firstName, String lastName, String gender, String race) {

        Gender getGender = GenderFactory.getGender(employeeNumber, gender);
        Race getRace = RaceFactory.getRace(employeeNumber, race);

        return new Employee.Builder().employeeNumber(employeeNumber)
                .firstName(firstName)
                .lastName(lastName)
                .gender(getGender)
                .race(getRace)
                .build();
    }
}