package com.kaylen.payroll.service.demography;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.repository.IRepository;

import java.util.Set;

public interface GenderService extends IRepository<Gender, String> {

    Set<Gender> getAll();
}
