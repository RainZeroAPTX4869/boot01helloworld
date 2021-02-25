package com.rain.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Car {
    private String brand;
    private String price;

}
