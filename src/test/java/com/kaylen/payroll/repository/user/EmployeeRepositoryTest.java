package com.kaylen.payroll.repository.user;

import com.kaylen.payroll.domain.user.Employee;
import com.kaylen.payroll.factory.user.EmployeeFactory;
import com.kaylen.payroll.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

public class EmployeeRepositoryTest {

    EmployeeRepositoryImpl repository;
    Employee employee;

    @Before
    public void setUp() throws Exception {

        repository = EmployeeRepositoryImpl.getRepository();
        employee = EmployeeFactory.getEmployee("12345", "Kaylen", "Abrahams");

    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(employee);
        assertNotNull(repository.getAll());
        System.out.println("Get All\n" + repository.getAll());
    }

    @Test
    public void create() {
        repository.create(employee);
        assertNotNull(repository.read(employee.getEmployeeNumber()));
        System.out.println("Created\n" + repository.read(employee.getEmployeeNumber()));
    }

    @Test
    public void read() {
        assertNotNull(repository.read(employee.getEmployeeNumber()));
        System.out.println("Read\n" + repository.read(employee.getEmployeeNumber()));
    }

    @Test
    public void update() {
        Employee employeeUpdated = EmployeeFactory.getEmployee("12345","Kevin","Abrahams");
        repository.update(employeeUpdated);

        Employee emp = repository.read("12345");
        assertNotEquals(employee.getFirstName(), emp.getFirstName());
        System.out.println("Updated\n" + repository.read("12345"));
    }

    @Test
    public void delete() {
        repository.delete("12345");
        assertNull(repository.read("12345"));
        System.out.println("Deleted\n" + repository.read("12345"));
    }

}