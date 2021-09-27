package com.example.springbootormjpa.controller;

import com.example.springbootormjpa.bean.Car;
import com.example.springbootormjpa.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public String selectLst(Model model) {
        model.addAttribute("cars", carService.selectList());
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }
    @PostMapping
    public String add(Car car){
        carService.insertCar(car);
        return "redirect:/car";
    }
}