package com.gabrieldev.cardapio.dto;

import com.gabrieldev.cardapio.entities.Food;

public record FoodResponseDTO(Long id, String titie, String image, Integer price) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());

    }
}
