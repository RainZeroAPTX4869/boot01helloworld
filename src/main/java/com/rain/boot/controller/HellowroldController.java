package com.rain.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/hello")
    public String handler01() {
        return "Hello Spring Boot 2";
    }
}
