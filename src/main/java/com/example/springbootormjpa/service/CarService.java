package com.example.springbootormjpa.service;

import com.example.springbootormjpa.bean.Car;
import com.example.springbootormjpa.dao.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    public List<Car> selectList() {
        return repository.findAll();
    }
    public void insertCar(Car car){
        repository.save(car);
    }

    ;
}
