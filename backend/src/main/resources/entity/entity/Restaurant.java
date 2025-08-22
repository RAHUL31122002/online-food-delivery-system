package com.foodapp.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Restaurant {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String description;
private String cuisines; // CSV for demo
private Boolean isOpen = true;
}
