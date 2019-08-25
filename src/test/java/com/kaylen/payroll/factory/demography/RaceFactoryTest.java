package com.kaylen.payroll.factory.demography;

import com.kaylen.payroll.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class RaceFactoryTest {

    Race race;
    @Before
    public void setUp() throws Exception {
        race = RaceFactory.getRace( "Coloured");
    }

    @Test
    public void getRace() {
        Assert.assertNotNull(race);
        System.out.println(race);
    }
}
