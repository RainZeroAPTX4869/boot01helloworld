package com.rain.boot;

import com.rain.boot.bean.Pet;
import com.rain.boot.bean.User;
import com.rain.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //查看容器组件,获取组件id,即配置类中的方法名
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //从容器中获取组件,第一个参数为组件id,第二个为对应的Bean类
        User user01 = run.getBean("user01", User.class);
        Pet tomcatPet = run.getBean("tomcatPet", Pet.class);

        System.out.println(user01.toString() + "," + tomcatPet.toString());

        //配置类也是组件,可直接调用
        MyConfig myConfig = run.getBean(MyConfig.class);
        System.out.println(myConfig);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法，SpringBoot就会检查容器里是否存在组件
        //保证组件单实例
        User user = myConfig.user01();
        Pet pet = myConfig.tomcatPet();
        System.out.println(user.toString() + "," + pet.toString());
        //如果@Configuration(proxyBeanMethods = true)这里就会为true，因为SpringBoot已经代理了，并且是个单实例
        System.out.println(user.getPet() == pet);


    }
}
