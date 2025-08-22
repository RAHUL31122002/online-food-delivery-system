# online-food-delivery-system
Food Delivery App

This is a Swiggy/Zomato-style food ordering system that connects restaurants with customers. Users can browse menus, add items to a cart, place orders, track delivery status, and pay online. Admins can onboard restaurants, manage menus, and monitor order flow.

🚀 Features

Browse restaurants & menus

Add to cart & checkout

Online payment integration (Razorpay/Stripe)

Live order tracking

Email/SMS order confirmation

Admin dashboard for managing restaurants & orders

🛠️ Tech Stack

Backend: Spring Boot, REST APIs, JPA/Hibernate

Frontend: Angular, TypeScript, Bootstrap/Tailwind

Database: MySQL

Payment: Razorpay / Stripe

Notifications: Email + SM


food-delivery-app/
│
├── backend/ # Spring Boot project
│ ├── src/main/java/com/app/fooddelivery/
│ │ ├── controller/
│ │ ├── entity/
│ │ ├── repository/
│ │ ├── service/
│ │ └── FoodDeliveryApplication.java
│ └── src/main/resources/
│ └── application.properties
│
├── frontend/ # Angular project
│ ├── src/app/
│ │ ├── components/
│ │ ├── services/
│ │ └── app.module.ts
│ └── angular.json
│
├── database/ # SQL schema & sample data
│ └── schema.sql
│
└── README.md
