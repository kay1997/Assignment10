package com.kaylen.payroll.repository.user;

import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {

    Set<Employee> getAll();
}
