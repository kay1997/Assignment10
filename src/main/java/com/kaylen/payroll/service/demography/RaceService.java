package com.kaylen.payroll.service.demography;

import com.kaylen.payroll.domain.demography.Race;
import com.kaylen.payroll.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {

    Set<Race> getAll();
}
