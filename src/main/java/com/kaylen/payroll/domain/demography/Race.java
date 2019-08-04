package com.kaylen.payroll.domain.demography;

import java.util.Objects;

public class Race {

    private String employeeNumber;
    private String raceType;

    private Race(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.raceType = builder.raceType;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getRaceType() {
        return raceType;
    }

    public static class Builder {

        private String employeeNumber;
        private String raceType;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder raceType(String raceType)
        {
            this.raceType = raceType;
            return this;
        }

        public Builder copy(Race race)
        {
            this.employeeNumber = employeeNumber;
            this.raceType = raceType;

            return this;
        }

        public Race build() {return new Race(this);}
    }

    @Override
    public String toString() {
        return "Race{" +
                "EmployeeNumber='" + employeeNumber + '\'' +
                "RaceType='" + raceType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return employeeNumber.equals(race.employeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }

}
