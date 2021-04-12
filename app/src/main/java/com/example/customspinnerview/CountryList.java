package com.example.customspinnerview;

public class CountryList {

    private String countryName;
    private int countryFlag;

    public CountryList(String countryName, int countryFlag) {
        this.countryName = countryName;
        this.countryFlag = countryFlag;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }
}
