package com.kaylen.payroll.service.demography.impl;

import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.repository.demography.RaceRepository;
import com.kaylen.payroll.repository.demography.impl.RaceRepositoryImpl;
import com.kaylen.payroll.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private static RaceServiceImpl service;
    private RaceRepository repository;

    private RaceServiceImpl(){this.repository = RaceRepositoryImpl.getRepository();}

    public static RaceServiceImpl getService()
    {
        if(service == null){service = new RaceServiceImpl();}
        return service;
    }

    @Override
    public Race create(Race race){
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String raceID){
        this.repository.delete(raceID);
    }

    @Override
    public Race read(String raceID) {
        return this.repository.read(raceID);
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

}
