package com.example.demo.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @date: 2021/9/14 16:11 星期二
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car implements Serializable {

    private Long id;

    private String cname;

    private Integer price;

    private String color;





}
