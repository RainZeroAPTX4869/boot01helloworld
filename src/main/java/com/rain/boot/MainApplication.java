package com.rain.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 * springboot入门
 *
 * @author RainZero
 * @date 2021/02/22 14:14
 */
/*注解是一个springboot应用*/

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);

    }
}
