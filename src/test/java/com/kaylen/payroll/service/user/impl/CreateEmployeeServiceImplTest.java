package com.kaylen.payroll.service.user.impl;

import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.service.user.CreateEmployeeService;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class CreateEmployeeServiceImplTest {

    CreateEmployeeServiceImpl createEmployeeService;

    @Before
    public void setUp() throws Exception {

        createEmployeeService = new CreateEmployeeServiceImpl();
    }

    @Test
    public void getEmployeeGender() {

        Employee employee = createEmployeeService.saveEmployee(UUID.randomUUID().toString(), "Kay", "Abrahams", "Male", "Coloured");
        System.out.println("Employee gender is:" + createEmployeeService.genderRepository.getAll());
        assertNotNull(createEmployeeService.genderRepository.getAll());
    }

    @Test
    public void getEmployeeRace() {

        Employee employee = createEmployeeService.saveEmployee(UUID.randomUUID().toString(), "Kay", "Abrahams", "Male", "Coloured");
        System.out.println("Employee race is:" + createEmployeeService.raceRepository.getAll());
        assertNotNull(createEmployeeService.raceRepository.getAll());

    }

    @Test
    public void saveEmployee() {

        Employee employee = createEmployeeService.saveEmployee(UUID.randomUUID().toString(), "Kay", "Abrahams", "Male", "Coloured");
        System.out.println("Created employee:" + employee);
        assertNotNull(employee);
        assertNotNull(createEmployeeService.employeeRepository.getAll());
    }
}