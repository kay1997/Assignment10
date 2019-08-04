package com.kaylen.payroll.factory.user;

import com.kaylen.payroll.domain.user.Employee;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class EmployeeFactoryTest {

    Employee employee;
    @Before
    public void setUp() throws Exception {
        employee = EmployeeFactory.getEmployee("12345", "Kaylen", "Abrahams","Male", "Coloured");
    }

    @Test
    public void getEmployee() {
        org.junit.Assert.assertNotNull(employee);
        System.out.println(employee);
    }
}
