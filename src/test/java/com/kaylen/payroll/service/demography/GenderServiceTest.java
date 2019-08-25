package com.kaylen.payroll.service.demography;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.factory.demography.GenderFactory;
import com.kaylen.payroll.service.demography.impl.GenderServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

public class GenderServiceTest {

    GenderServiceImpl service;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        service = GenderServiceImpl.getService();
        gender = GenderFactory.getGender(" Male");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
        service.create(gender);
        assertNotNull(service.getAll());
        System.out.println("Get All\n" + service.getAll());
    }

    @Test
    public void create() {
        service.create(gender);
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
        service.create(gender);
        System.out.println(service.read("12345"));

        Gender genderUpdated = GenderFactory.getGender("Female");
        service.update(genderUpdated);

        Gender gen = service.read("12345");
        Assert.assertNotEquals(gender.getGenderType(), gen.getGenderType());
        System.out.println("Updated\n" + service.read("12345"));
    }

    @Test
    public void delete() {
        service.delete("12345");
        assertNull(service.read(gender.getGenderID()));
        System.out.println("Delete\n" + service.read(gender.getGenderID()));
    }
}
