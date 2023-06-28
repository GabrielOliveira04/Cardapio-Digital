package com.gabrieldev.cardapio.entities;

import com.gabrieldev.cardapio.dto.FoodResquestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "foods")
@Table(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;


    public Food(FoodResquestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }


}
