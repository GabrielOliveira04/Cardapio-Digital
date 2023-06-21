package com.gabrieldev.cardapio.controller;

import com.gabrieldev.cardapio.dto.FoodResponseDTO;
import com.gabrieldev.cardapio.dto.FoodResquestDTO;
import com.gabrieldev.cardapio.entities.Food;
import com.gabrieldev.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {


    @Autowired
    FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodResquestDTO data){
        
    }


    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
