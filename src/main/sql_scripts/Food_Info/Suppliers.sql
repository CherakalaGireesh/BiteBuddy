CREATE TABLE Suppliers (
                           supplier_id INT PRIMARY KEY AUTO_INCREMENT,
                           supplier_name VARCHAR(100) NOT NULL,
                           contact_person VARCHAR(100),
                           phone_number VARCHAR(20),
                           email VARCHAR(100),
                           address TEXT,
                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                           updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
