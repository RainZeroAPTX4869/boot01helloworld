package com.rain.boot.bean;

import lombok.*;

/**
 * Created with IntelliJ IDEA.
 * lombok的无参、全参构造器，get、set方法，toString方法,hashcode方法
 *
 * @author RainZero
 * @date 2021/02/23 10:54
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Pet {
    private String name;

}
