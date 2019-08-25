package com.kaylen.payroll.repository.demography;

import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.factory.demography.RaceFactory;
import com.kaylen.payroll.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;

public class RaceRepositoryTest {

    RaceRepositoryImpl repository;
    Race race;

    @Before
    public void setUp() throws Exception {

        repository = RaceRepositoryImpl.getRepository();
        race = RaceFactory.getRace("White");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(race);
        assertNotNull(repository.getAll());
        System.out.println("Get All\n" + repository.getAll());
    }

    @Test
    public void create() {
        repository.create(race);
        assertNotNull(repository.read(race.getRaceID()));
        System.out.println("Created\n" + repository.read(race.getRaceID()));
    }

    @Test
    public void read() {
        assertNotNull(repository.read(race.getRaceID()));
        System.out.println("Read\n" + repository.read(race.getRaceID()));
    }

    @Test
    public void update() {
        Race employeeUpdated = RaceFactory.getRace( "Coloured");
        repository.update(employeeUpdated);

        Race gen = repository.read("12345");
        assertNotEquals(race.getRaceType(), gen.getRaceType());
        System.out.println("Updated\n" + repository.read("12345"));
    }

    @Test
    public void delete() {
        repository.delete("12345");
        assertNull(repository.read("12345"));
        System.out.println("Deleted\n" + repository.read("12345"));
    }

}
