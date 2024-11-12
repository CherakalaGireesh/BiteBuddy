
CREATE TABLE Nutrition_Info (
                                nutrition_id INT PRIMARY KEY AUTO_INCREMENT,
                                food_id INT, -- Foreign key referencing Food_Items
                                calories INT,
                                total_fats DECIMAL(10, 2),
                                saturated_fats DECIMAL(10, 2),
                                trans_fats DECIMAL(10, 2),
                                cholesterol INT,
                                sodium INT,
                                total_carbohydrates INT,
                                dietary_fiber INT,
                                sugars INT,
                                protein INT,
                                created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                FOREIGN KEY (food_id) REFERENCES Food_Items(food_id) ON DELETE CASCADE
);