CREATE TABLE Payment_Methods (
                                 payment_method_id INT PRIMARY KEY AUTO_INCREMENT,
                                 payment_method_name VARCHAR(50) NOT NULL UNIQUE,
                                 created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                 updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);