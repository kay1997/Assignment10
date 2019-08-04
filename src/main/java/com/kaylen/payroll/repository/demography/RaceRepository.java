package com.kaylen.payroll.repository.demography;

import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {

    Set<Race> getAll();
}
