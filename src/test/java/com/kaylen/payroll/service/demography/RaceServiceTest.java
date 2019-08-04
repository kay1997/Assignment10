package com.kaylen.payroll.service.demography;

import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.factory.demography.RaceFactory;
import com.kaylen.payroll.service.demography.impl.RaceServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

public class RaceServiceTest {

    RaceServiceImpl service;
    Race race;

    @Before
    public void setUp() throws Exception {
        service = RaceServiceImpl.getService();
        race = RaceFactory.getRace("12345", " White");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
        service.create(race);
        assertNotNull(service.getAll());
        System.out.println("Get All\n" + service.getAll());
    }

    @Test
    public void create() {
        service.create(race);
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
        service.create(race);
        System.out.println(service.read("12345"));

        Race raceUpdated = RaceFactory.getRace("12345", "Coloured");
        service.update(raceUpdated);

        Race emp = service.read("12345");
        Assert.assertNotEquals(race.getRaceType(), emp.getRaceType());
        System.out.println("Updated\n" + service.read("12345"));
    }

    @Test
    public void delete() {
        service.delete("12345");
        assertNull(service.read(race.getEmployeeNumber()));
        System.out.println("Delete\n" + service.read(race.getEmployeeNumber()));
    }
}

