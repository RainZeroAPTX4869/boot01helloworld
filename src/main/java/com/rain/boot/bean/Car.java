package com.rain.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * 注解@Component只有在容器中的组件才能拥有SpringBoot提供的功能或者在配置类中加载
 * 注解ConfigurationProperties(prefix = "mycar")加载配置文件中前缀为"mycar"的配置
 *
 * @author RainZero
 * @date 2021/02/24 10:34
 */
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private String price;

    public Car() {
    }

    public Car(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
