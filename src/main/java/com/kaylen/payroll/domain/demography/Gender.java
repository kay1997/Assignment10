package com.kaylen.payroll.domain.demography;

import java.util.Objects;

public class Gender {

    private String employeeNumber;
    private String genderType;

    private Gender(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.genderType = builder.genderType;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getGenderType(){return genderType;}

    public static class Builder {

        private String employeeNumber;
        private String genderType;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder genderType(String genderType)
        {
            this.genderType = genderType;
            return this;
        }

        public Builder copy(Gender gender)
        {
            this.employeeNumber = employeeNumber;
            this.genderType = genderType;

            return this;
        }

        public Gender build() {return new Gender(this);}
    }

    @Override
    public String toString() {
        return "Gender{" +
                "EmployeeNumber='" + employeeNumber + '\'' +
                "GenderType='" + genderType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return employeeNumber.equals(gender.employeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }

}
