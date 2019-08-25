package com.kaylen.payroll.repository.demography.impl;

import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.repository.demography.RaceRepository;

import java.util.*;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl repository = null;
    private Map<String, Race> races;

    private RaceRepositoryImpl() {
        this.races = new HashMap<>();
    }

    public static RaceRepositoryImpl getRepository(){
        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }


    public Set<Race> getAll() {
        Collection<Race> races = this.races.values();
        Set<Race> set = new HashSet<>();
        set.addAll(races);
        return set;
    }

    @Override
    public Race create(Race race) {
        if(read(race.getRaceID())  == null){
            this.races.put(race.getRaceID(),race);
        }
        return race;
    }

    @Override
    public Race read(String e) {
        return this.races.get(e);
    }

    @Override
    public Race update(Race race) {
        if(read(race.getRaceID()) != null){
            races.replace(race.getRaceID(), race);
        }
        return race;
    }

    @Override
    public void delete(String e) {
        Race race = read(e);
        this.races.remove(e, race);
    }

}
