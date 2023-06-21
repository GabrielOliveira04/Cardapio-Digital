package com.gabrieldev.cardapio.repository;

import com.gabrieldev.cardapio.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
