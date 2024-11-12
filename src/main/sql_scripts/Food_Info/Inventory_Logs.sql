CREATE TABLE Inventory_Logs (
                                log_id INT PRIMARY KEY AUTO_INCREMENT,
                                food_id INT, -- Foreign key referencing Food_Items
                                change_type ENUM('ADD', 'REMOVE') NOT NULL, -- Type of change
                                change_quantity INT NOT NULL, -- Quantity added or removed
                                change_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Date of the change
                                created_by INT, -- User ID of the person making the change
                                FOREIGN KEY (food_id) REFERENCES Food_Items(food_id) ON DELETE CASCADE
);