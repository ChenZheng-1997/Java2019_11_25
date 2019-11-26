package com.service;

import com.domain.City;

import java.util.List;

public interface CityService {


    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    void delup(int id, City city);

    List<City> selectAllCity();

}
