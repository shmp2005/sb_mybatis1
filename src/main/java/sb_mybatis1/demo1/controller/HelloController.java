package sb_mybatis1.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sb_mybatis1.demo1.domain.City;
import sb_mybatis1.demo1.mapper.CityMapper;

@RestController
public class HelloController {

    @Autowired
    CityMapper cityMapper;

    @GetMapping("/")
    public void hello(){
        City city = cityMapper.findByState("CA");
        System.out.println(city);
    }
}
