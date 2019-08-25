package com.kaylen.payroll.domain.demography;

import java.util.Objects;

public class Race {

    private String raceID;
    private String raceType;

    private Race(Builder builder)
    {
        this.raceID = builder.raceID;
        this.raceType = builder.raceType;
    }

    public String getRaceID() {
        return raceID;
    }

    public String getRaceType() {
        return raceType;
    }

    public static class Builder {

        private String raceID;
        private String raceType;

        public Builder raceID(String raceID)
        {
            this.raceID = raceID;
            return this;
        }

        public Builder raceType(String raceType)
        {
            this.raceType = raceType;
            return this;
        }

        public Builder copy(Race race)
        {
            this.raceID = raceID;
            this.raceType = raceType;

            return this;
        }

        public Race build() {return new Race(this);}
    }

    @Override
    public String toString() {
        return "Race{" +
                "RaceID='" + raceID + '\'' +
                "RaceType='" + raceType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return raceID.equals(race.raceID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceID);
    }

}
