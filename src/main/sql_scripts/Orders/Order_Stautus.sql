
CREATE TABLE Order_Status (
                              order_status_id INT PRIMARY KEY AUTO_INCREMENT,
                              status_name VARCHAR(50) NOT NULL UNIQUE,
                              description TEXT,
                              created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
