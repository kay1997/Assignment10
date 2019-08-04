package com.kaylen.payroll.domain.user;

import com.kaylen.payroll.domain.demography.Gender;
import com.kaylen.payroll.domain.demography.Race;

import java.util.Objects;

public class Employee {

    private String employeeNumber, firstName, lastName;
    private Gender gender;
    private Race race;

    private Employee() {}

    private Employee(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.race = builder.race;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() { return gender; }

    public Race getRace() { return race; }

    public static class Builder {

        private String employeeNumber;
        private String firstName;
        private String lastName;
        private Gender gender;
        private Race race;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder gender(Gender gender)
        {
            this.gender = gender;
            return this;
        }

        public Builder race(Race race)
        {
            this.race = race;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.employeeNumber = employeeNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.race = race;

            return this;
        }

        public Employee build() {return new Employee(this);}
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeNumber='" + employeeNumber + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Gender='" + gender.getGenderType()+ '\'' +
                ", Race='" + race.getRaceType() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber.equals(employee.employeeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }

}
