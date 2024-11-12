CREATE TABLE Food_Allergens (
                                food_id INT, -- Foreign key referencing Food_Items
                                allergen_id INT, -- Foreign key referencing Allergens
                                PRIMARY KEY (food_id, allergen_id),
                                FOREIGN KEY (food_id) REFERENCES Food_Items(food_id) ON DELETE CASCADE,
                                FOREIGN KEY (allergen_id) REFERENCES Allergens(allergen_id) ON DELETE CASCADE
);
