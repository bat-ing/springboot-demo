package com.example.springbootormjpa.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @date: 2021/9/14 16:11 星期二
 * @Description:
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="car")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cname;
    @Column
    private Integer price;
    @Column
    private String color;





}
