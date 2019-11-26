package com.service;

import com.domain.City;
import com.mapper.CityMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(City record) {
        return cityMapper.insert(record);
    }

    @Override
    public int insertSelective(City record) {
        return cityMapper.insertSelective(record);
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return cityMapper.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加这个注释后 当后边数据库操作时发成错误时，所有的数据都不执行
    public void delup(int id, City city) {
        cityMapper.deleteByPrimaryKey(id);
        Integer.valueOf("a");//添加一个错误
        cityMapper.updateByPrimaryKey(city);
    }

    @Override
    public List<City> selectAllCity() {
        return cityMapper.selectAllCity();
    }

}
