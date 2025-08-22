package com.foodapp.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MenuItem {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long restaurantId;
private String name;
private String description;
private Double price;
private Boolean isAvailable = true;
}
