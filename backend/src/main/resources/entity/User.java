package com.foodapp.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
@Column(unique = true)
private String email;
private String phone;
private String passwordHash;
private String role; // CUSTOMER | RESTAURANT | ADMIN | DELIVERY
}
