package com.kaylen.payroll.service.user;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.domain.user.Employee;

public interface CreateEmployeeService {

    Employee saveEmployee(String employeeNumber, String firstName, String lastName, String gender, String race);

    Gender getEmployeeGender(String id);

    Race getEmployeeRace (String id);
}