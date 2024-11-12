CREATE TABLE Order_Details (
                               order_detail_id INT PRIMARY KEY AUTO_INCREMENT,
                               order_id INT, -- Foreign key referencing Orders
                               food_id INT, -- Foreign key referencing Food_Items
                               quantity INT NOT NULL,
                               price DECIMAL(10, 2) NOT NULL,
                               created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                               updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                               FOREIGN KEY (order_id) REFERENCES Orders(order_id) ON DELETE CASCADE,
                               FOREIGN KEY (food_id) REFERENCES Food_Items(food_id) ON DELETE SET NULL
);
