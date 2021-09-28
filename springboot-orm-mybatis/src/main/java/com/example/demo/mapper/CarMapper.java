package com.example.demo.mapper;

import com.example.demo.bean.Car;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface CarMapper {
    @Select("select * from car where id>#{id}")
    List<Car> selectList(Long id);
}
