package com.kaylen.payroll.service.user.impl;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.factory.demography.GenderFactory;
import com.kaylen.payroll.factory.demography.RaceFactory;
import com.kaylen.payroll.factory.user.EmployeeFactory;
import com.kaylen.payroll.repository.demography.impl.GenderRepositoryImpl;
import com.kaylen.payroll.repository.demography.impl.RaceRepositoryImpl;
import com.kaylen.payroll.repository.user.impl.EmployeeRepositoryImpl;
import com.kaylen.payroll.service.user.CreateEmployeeService;

public class CreateEmployeeServiceImpl implements CreateEmployeeService {

  RaceRepositoryImpl raceRepository = RaceRepositoryImpl.getRepository();
   GenderRepositoryImpl genderRepository = GenderRepositoryImpl.getRepository();
   EmployeeRepositoryImpl employeeRepository = EmployeeRepositoryImpl.getRepository();

    GenderFactory genderFactory;
    RaceFactory raceFactory;
    EmployeeFactory employeeFactory;


    @Override
    public Gender getEmployeeGender(String gender)
    {
        return this.genderRepository.read(gender);
    }

    @Override
    public Race getEmployeeRace(String race)
    {
        return this.raceRepository.read(race);
    }

    @Override
    public Employee saveEmployee(String employeeNumber, String firstName, String lastName, String gender, String race)
    {
        Employee employee = this.employeeRepository.create(EmployeeFactory.getEmployee(employeeNumber, firstName, lastName));
        Gender gen = this.genderRepository.create(GenderFactory.getGender(gender));
        Race r = this.raceRepository.create(RaceFactory.getRace(race));

        return employee;

    }



}
