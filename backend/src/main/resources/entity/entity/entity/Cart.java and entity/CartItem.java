package com.foodapp.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Cart {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long userId;
private Long restaurantId;
private Double subtotal = 0.0;
}


@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CartItem {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long cartId;
private Long menuItemId;
private Integer qty;
private Double priceEach;
}
