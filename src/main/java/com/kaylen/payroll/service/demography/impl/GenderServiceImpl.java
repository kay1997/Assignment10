package com.kaylen.payroll.service.demography.impl;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.repository.demography.GenderRepository;
import com.kaylen.payroll.repository.demography.impl.GenderRepositoryImpl;
import com.kaylen.payroll.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service;
    private GenderRepository repository;

    private GenderServiceImpl(){this.repository = GenderRepositoryImpl.getRepository();}

    public static GenderServiceImpl getService()
    {
        if(service == null){service = new GenderServiceImpl();}
        return service;
    }

    @Override
    public Gender create(Gender gender){
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String employeeNumber){
        this.repository.delete(employeeNumber);
    }

    @Override
    public Gender read(String employeeNumber) {
        return this.repository.read(employeeNumber);
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }

}

