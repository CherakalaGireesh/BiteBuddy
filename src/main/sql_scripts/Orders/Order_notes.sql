CREATE TABLE Order_Notes (
                             note_id INT PRIMARY KEY AUTO_INCREMENT,
                             order_id INT, -- Foreign key referencing Orders
                             note_text TEXT NOT NULL,
                             created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                             updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                             FOREIGN KEY (order_id) REFERENCES Orders(order_id) ON DELETE CASCADE
);
