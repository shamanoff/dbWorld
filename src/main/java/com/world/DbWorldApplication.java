package com.world;

import com.world.dao.CityDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbWorldApplication {

    public static void main(String[] args) {
        BeanFactory beanFactory = SpringApplication.run(DbWorldApplication.class, args);
        System.out.println(beanFactory.getBean(CityDao.class).findByName("Moscow"));

//        beanFactory.getBean(CityDao.class).delete(4083L);
//		beanFactory.getBean(CityDao.class).save(new City( 8800L, "GOTHAM", "AFG", "ffff", 44L));

//		System.out.println(beanFactory.getBean(CityDao.class).findByName("GOTHAM"));
    }
}
