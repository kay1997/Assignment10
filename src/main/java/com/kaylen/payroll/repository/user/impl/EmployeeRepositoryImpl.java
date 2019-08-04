package com.kaylen.payroll.repository.user.impl;

import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.repository.user.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepositoryImpl() {
        this.employees = new HashMap<>();
    }

    public static EmployeeRepositoryImpl getRepository(){
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employees = this.employees.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee) {
        if(read(employee.getEmployeeNumber())  == null){
            this.employees.put(employee.getEmployeeNumber(),employee);
        }
        return employee;
    }

    @Override
    public Employee read(String e) {
        return this.employees.get(e);
    }

    @Override
    public Employee update(Employee employee) {
        if(read(employee.getEmployeeNumber()) != null){
            employees.replace(employee.getEmployeeNumber(), employee);
        }
        return employee;
    }

    @Override
    public void delete(String e) {
        Employee employee = read(e);
        this.employees.remove(e, employee);
    }

}
