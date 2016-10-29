package com.world.dao;

import com.world.entity.City;
import com.world.repository.ICityRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityDao implements ICityDao {

    @Autowired
    private ICityRep iCityRep;

    @Override
    public void save(City city) {
        iCityRep.save(city);
    }

    @Override
    public City findOne(Long id) {
        return iCityRep.findOne(id);

    }

    @Override
    public List<City> findAll() {
        return iCityRep.findAll();
    }

    @Override
    public City delete(Long id) {
        City city = iCityRep.findOne(id);
        iCityRep.delete(id);
        return city;
    }

    @Override
    public void upDate(City city) {

    }

    public City findByName(String name) {
        return iCityRep.findByName(name);

    }
}
