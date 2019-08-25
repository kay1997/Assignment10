package com.kaylen.payroll.service.user;

import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.factory.user.EmployeeFactory;
import com.kaylen.payroll.service.user.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

public class EmployeeServiceTest {

    EmployeeServiceImpl service;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        service = EmployeeServiceImpl.getService();
        employee = EmployeeFactory.getEmployee("12345", "Kaylen", "Abrahams");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
        service.create(employee);
        assertNotNull(service.getAll());
        System.out.println("Get All\n" + service.getAll());
    }

    @Test
    public void create() {
        service.create(employee);
        assertNotNull(service.read("12345"));
        System.out.println("Created\n" + service.read("12345"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("12345"));
        System.out.println("Read\n" + service.read("12345"));
    }

    @Test
    public void update() {
        service.create(employee);
        System.out.println(service.read("12345"));

        Employee employeeUpdated = EmployeeFactory.getEmployee("12345", "Kevin", "Abrahams");
        service.update(employeeUpdated);

        Employee emp = service.read("12345");
        Assert.assertNotEquals(employee.getFirstName(), emp.getFirstName());
        System.out.println("Updated\n" + service.read("12345"));
    }

    @Test
    public void delete() {
        service.delete("12345");
        assertNull(service.read(employee.getEmployeeNumber()));
        System.out.println("Delete\n" + service.read(employee.getEmployeeNumber()));
    }

}
