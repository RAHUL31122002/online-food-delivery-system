-- Database
CREATE DATABASE food_app;
USE food_app;


-- Restaurants
CREATE TABLE restaurants (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
address VARCHAR(255),
phone VARCHAR(20)
);


-- Menu Items
CREATE TABLE menu_items (
id INT AUTO_INCREMENT PRIMARY KEY,
restaurant_id INT,
name VARCHAR(100) NOT NULL,
description TEXT,
price DECIMAL(10,2) NOT NULL,
FOREIGN KEY (restaurant_id) REFERENCES restaurants(id)
);


-- Users
CREATE TABLE users (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
email VARCHAR(100) UNIQUE,
password VARCHAR(255)
);


-- Orders
CREATE TABLE orders (
id INT AUTO_INCREMENT PRIMARY KEY,
user_id INT,
restaurant_id INT,
status VARCHAR(50) DEFAULT 'PENDING',
total DECIMAL(10,2),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (user_id) REFERENCES users(id),
FOREIGN KEY (restaurant_id) REFERENCES restaurants(id)
);


-- Order Items
CREATE TABLE order_items (
id INT AUTO_INCREMENT PRIMARY KEY,
order_id INT,
menu_item_id INT,
quantity INT NOT NULL,
FOREIGN KEY (order_id) REFERENCES orders(id),
FOREIGN KEY (menu_item_id) REFERENCES menu_items(id)
);


-- Sample Data
INSERT INTO restaurants (name, address, phone) VALUES
('Pizza Palace', '123 Main St', '9876543210'),
('Burger Hub', '456 Market St', '9876543222');


(2, 'Veggie Burger', 'Loaded veggie patty with sauces', 149.00);
