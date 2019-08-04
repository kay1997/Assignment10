package com.kaylen.payroll.service.user;

import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {

    Set<Employee> getAll();
}
