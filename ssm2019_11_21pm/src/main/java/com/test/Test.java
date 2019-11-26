package com.test;

import com.domain.City;
import com.service.CityService;
import com.service.CityServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        CityService cityService = classPathXmlApplicationContext.getBean("cityServiceImpl", CityServiceImpl.class);
        City city = cityService.selectByPrimaryKey(21);
        System.out.println(city.getName());
    }
}
