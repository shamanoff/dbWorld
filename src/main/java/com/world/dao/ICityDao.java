package com.world.dao;

import com.world.entity.City;

import java.util.List;

public interface ICityDao {
    void save(City city);

    City findOne(Long id);

    List<City> findAll();

    City delete(Long id);

    void upDate(City city);

    City findByName(String name);
}
