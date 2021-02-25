package com.rain.boot.controller;

import com.rain.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/02/22 14:19
 */

/*
@RestController可代替下面两项注解
@Controller
@ResponseBody
*/

@RestController
public class HellowroldController {

    //自动注入，加载容器中的car
    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String handler01(@RequestParam("name") String name) {
        return "Hello Spring Boot 2 :" + name;
    }
}
