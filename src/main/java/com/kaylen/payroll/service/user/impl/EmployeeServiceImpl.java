package com.kaylen.payroll.service.user.impl;

import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.repository.user.EmployeeRepository;
import com.kaylen.payroll.repository.user.impl.EmployeeRepositoryImpl;
import com.kaylen.payroll.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) {service = new EmployeeServiceImpl();}
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String employeeNumber) {
        this.repository.delete(employeeNumber);
    }

    @Override
    public Employee read(String employeeNumber) {
        return this.repository.read(employeeNumber);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}

