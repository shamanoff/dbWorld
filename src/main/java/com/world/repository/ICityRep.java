package com.world.repository;

import com.world.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
public interface ICityRep extends JpaRepository<City, Long> {
    @Query("select e from city e where e.name = :name")
    City findByName(@Param("name") String name);

}
