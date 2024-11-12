CREATE TABLE Food_Items (
                            food_id INT PRIMARY KEY AUTO_INCREMENT,
                            food_name VARCHAR(100) NOT NULL,
                            description TEXT,
                            category_id INT, -- Foreign key referencing Categories
                            price DECIMAL(10, 2) NOT NULL,
                            unit_of_measure ENUM('kg', 'g', 'lb', 'oz', 'liter', 'ml', 'piece') NOT NULL,
                            stock_quantity INT NOT NULL DEFAULT 0,
                            reorder_level INT NOT NULL DEFAULT 0,
                            supplier_id INT, -- Foreign key referencing Suppliers
                            image_url VARCHAR(255),
                            is_active BOOLEAN DEFAULT TRUE,
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                            created_by INT,
                            updated_by INT,
                            is_deleted BOOLEAN DEFAULT FALSE,
                            FOREIGN KEY (category_id) REFERENCES Categories(category_id) ON DELETE SET NULL,
                            FOREIGN KEY (supplier_id) REFERENCES Suppliers(supplier_id) ON DELETE SET NULL
);