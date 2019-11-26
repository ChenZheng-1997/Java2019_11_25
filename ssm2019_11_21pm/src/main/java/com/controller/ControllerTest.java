package com.controller;

import com.common.PageSizeTest;
import com.domain.City;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ControllerTest {

    @Resource(name = "cityServiceImpl")
    CityService cityService;

    @RequestMapping("/a")
    public String a() {
        // ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        // CityService cityService = classPathXmlApplicationContext.getBean("cityServiceImpl", CityServiceImpl.class);
        City city = cityService.selectByPrimaryKey(21);
        System.out.println(city.getName());
        return "";
    }

    @RequestMapping("/b")
    public String b() {
        City city = new City();
        city.setId(1);
        city.setName("cz");
        cityService.delup(5, city);
        System.out.println("OK");
        return "";
    }

    @RequestMapping("/c")
    public ModelAndView c(int page) {
        int pageSize = PageSizeTest.pageSize;//从配置文件获取每页几条
        PageHelper.startPage(page, pageSize);//设置显示的页数和每页几条
        List<City> list = cityService.selectAllCity();
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("citylise", list);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("citylist");
        return modelAndView;
    }


}
