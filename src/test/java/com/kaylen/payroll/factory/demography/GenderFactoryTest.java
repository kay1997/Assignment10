package com.kaylen.payroll.factory.demography;

import com.kaylen.payroll.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GenderFactoryTest {

    Gender gender;
    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.getGender("12345", "Male");
    }

    @Test
    public void getGender() {
        Assert.assertNotNull(gender);
        System.out.println(gender);
    }
}
