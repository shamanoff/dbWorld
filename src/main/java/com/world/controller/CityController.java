package com.world.controller;

import com.world.dao.ICityDao;
import com.world.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    public ICityDao iCityDao;
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody City city){
        iCityDao.save(city);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/all")
    public ResponseEntity<List<City>> findAll(){
        return ResponseEntity.ok(iCityDao.findAll());
    }
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<City> find(@PathVariable("id")Long id){
        return ResponseEntity.ok(iCityDao.findOne(id));
    }

    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
    public ResponseEntity<City> findByName(@PathVariable("name")String name){
        return ResponseEntity.ok(iCityDao.findByName(name));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public City delete (@PathVariable("id")Long id){
        ResponseEntity.ok(iCityDao.findOne(id));
        return iCityDao.delete(id);
    }




}
