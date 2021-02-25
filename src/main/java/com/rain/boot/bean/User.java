package com.rain.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/02/23 10:53
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
    private String name;
    private String age;
    private Pet pet;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
