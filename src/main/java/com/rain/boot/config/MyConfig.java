package com.rain.boot.config;

import com.rain.boot.bean.Car;
import com.rain.boot.bean.Pet;
import com.rain.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * 注解告诉springboot，这是一个配置类
 * 1、配置类使用@Bean标注在方法上给容器注册组件，默认是单实例
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods代理Bean的方法
 * (proxyBeanMethods = true)全模式，可以解决组件依赖
 * (proxyBeanMethods = false)轻量级，SpringBoot启动加载更快
 * 所以配置类中组件没有依赖，调成false
 * 注解@EnableConfigurationProperties(Car.class)开启car配置绑定功能不用在Car中@Component，方便使用第三方包；自动注册到容器
 *
 * @author RainZero
 * @date 2021/02/23 11:00
 */
@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(Car.class)
public class MyConfig {
    /**
     * 给容器中添加组件
     * 外部无论对配置类中的组件调用多少次，都是之前的单实例
     * 注解@ConditionalOnBean(name = "tomcatPet")条件注解，有该名的组件就添加下面的组件，可以放在类名外
     */
    @Bean
    public Pet tomcatPet() {
        return new Pet("tom");
    }

    @ConditionalOnBean(name = "tomcatPet")
    @Bean
    public User user01() {
        User user = new User("张三", "25");
        //user组件依赖了pet组件
        user.setPet(tomcatPet());
        return user;
    }

}
