package com.world.entity;

public interface ICity {
    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    String getCountrycode();

    void setCountrycode(String countrycode);

    String getDistrict();

    void setDistrict(String district);

    Long getPopulation();

    void setPopulation(Long population);
}
