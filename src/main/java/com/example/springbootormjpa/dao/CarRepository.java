package com.example.springbootormjpa.dao;

import com.example.springbootormjpa.bean.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {


}
