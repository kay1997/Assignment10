package com.kaylen.payroll.repository.demography.impl;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.repository.demography.GenderRepository;

import java.util.*;

import static java.util.Locale.filter;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Map<String, Gender> genders;

    private GenderRepositoryImpl() {
        this.genders = new HashMap<>();
    }

    public static GenderRepositoryImpl getRepository(){
        if(repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }


    public Set<Gender> getAll() {
        Collection<Gender> genders = this.genders.values();
        Set<Gender> set = new HashSet<>();
        set.addAll(genders);
        return set;
    }

    @Override
    public Gender create(Gender gender) {
        if(read(gender.getEmployeeNumber())  == null){
            this.genders.put(gender.getEmployeeNumber(),gender);
        }
        return gender;
    }

    @Override
    public Gender read(String e) {
        return this.genders.get(e);
    }

    @Override
    public Gender update(Gender gender) {
        if(read(gender.getEmployeeNumber()) != null){
            genders.replace(gender.getEmployeeNumber(), gender);
        }
        return gender;
    }

    @Override
    public void delete(String e) {
        Gender gender = read(e);
        this.genders.remove(e, gender);
    }

}
