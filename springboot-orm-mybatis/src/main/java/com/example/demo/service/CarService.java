package com.example.demo.service;


import com.example.demo.bean.Car;
import com.example.demo.tkmapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarMapper mapper;

    public List<Car> selectList(Long id) {
        return mapper.selectAll();
    }
    public void insertCar(Car car){
//        repository.save(car);
    }

    ;
}
