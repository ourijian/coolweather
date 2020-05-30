package com.coolweather.android.json;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Sport{
        @SerializedName("txt")
        public String info;

        @Override
        public String toString() {
            return "Sport{" +
                    "info='" + info + '\'' +
                    '}';
        }
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;

        @Override
        public String toString() {
            return "CarWash{" +
                    "info='" + info + '\'' +
                    '}';
        }
    }

    public class Comfort{
        @SerializedName("txt")
        public String info;

        @Override
        public String toString() {
            return "Comfort{" +
                    "info='" + info + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Suggestion{" +
                "comfort=" + comfort +
                ", carWash=" + carWash +
                ", sport=" + sport +
                '}';
    }
}
