package com.kaylen.payroll.repository.demography;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.factory.demography.GenderFactory;
import com.kaylen.payroll.repository.demography.impl.GenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

public class GenderRepositoryTest {

        GenderRepositoryImpl repository;
        Gender gender;

        @Before
        public void setUp() throws Exception {

            repository = GenderRepositoryImpl.getRepository();
            gender = GenderFactory.getGender("12345", "Male");
        }

        @Test
        public void getRepository() {
            assertNotNull(repository);
            System.out.println(repository);
        }

        @Test
        public void getAll() {
            repository.create(gender);
            assertNotNull(repository.getAll());
            System.out.println("Get All\n" + repository.getAll());
        }

        @Test
        public void create() {
            repository.create(gender);
            assertNotNull(repository.read(gender.getEmployeeNumber()));
            System.out.println("Created\n" + repository.read(gender.getEmployeeNumber()));
        }

        @Test
        public void read() {
            assertNotNull(repository.read(gender.getEmployeeNumber()));
            System.out.println("Read\n" + repository.read(gender.getEmployeeNumber()));
        }

        @Test
        public void update() {
            Gender employeeUpdated = GenderFactory.getGender("12345", "Female");
            repository.update(employeeUpdated);

            Gender gen = repository.read("12345");
            assertNotEquals(gender.getGenderType(), gen.getGenderType());
            System.out.println("Updated\n" + repository.read("12345"));
        }

        @Test
        public void delete() {
            repository.delete("12345");
            assertNull(repository.read("12345"));
            System.out.println("Deleted\n" + repository.read("12345"));
        }


    }
