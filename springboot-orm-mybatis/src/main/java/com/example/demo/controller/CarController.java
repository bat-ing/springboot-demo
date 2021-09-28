package com.example.demo.controller;


import com.example.demo.bean.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public String selectLst(Model model) {
        model.addAttribute("cars", carService.selectList(100l));
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