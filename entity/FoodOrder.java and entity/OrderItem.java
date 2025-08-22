package com.foodapp.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;


@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class FoodOrder {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long userId;
private Long restaurantId;
private Double amountTotal;
private String status; // PENDING, ACCEPTED, OUT_FOR_DELIVERY, DELIVERED
private Instant placedAt;
}


@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class OrderItem {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Long orderId;
private Long menuItemId;
private String nameSnapshot;
private Integer qty;
private Double priceEach;
}
