CREATE TABLE Allergens (
                           allergen_id INT PRIMARY KEY AUTO_INCREMENT,
                           allergen_name VARCHAR(100) NOT NULL UNIQUE,
                           description TEXT
);