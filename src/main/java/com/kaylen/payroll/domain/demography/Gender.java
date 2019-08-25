package com.kaylen.payroll.domain.demography;

import java.util.Objects;

public class Gender {

    private String genderID;
    private String genderType;

    private Gender(Builder builder)
    {
        this.genderID = builder.genderID;
        this.genderType = builder.genderType;
    }

    public String getGenderID() {
        return genderID;
    }

    public String getGenderType(){return genderType;}

    public static class Builder {

        private String genderID;
        private String genderType;

        public Builder genderID(String genderID)
        {
            this.genderID = genderID;
            return this;
        }

        public Builder genderType(String genderType)
        {
            this.genderType = genderType;
            return this;
        }

        public Builder copy(Gender gender)
        {
            this.genderID = genderID;
            this.genderType = genderType;

            return this;
        }

        public Gender build() {return new Gender(this);}
    }

    @Override
    public String toString() {
        return "Gender{" +
                "GenderID='" + genderID + '\'' +
                "GenderType='" + genderType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return genderID.equals(gender.genderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderID);
    }

}
