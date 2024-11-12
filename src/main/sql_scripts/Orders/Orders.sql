CREATE TABLE Orders (
                        order_id INT PRIMARY KEY AUTO_INCREMENT,
                        customer_id INT, -- Foreign key referencing Customers
                        order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        total_amount DECIMAL(10, 2) NOT NULL,
                        order_status_id INT, -- Foreign key referencing Order_Status
                        payment_method_id INT, -- Foreign key referencing Payment_Methods
                        shipping_address TEXT,
                        billing_address TEXT,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        FOREIGN KEY (customer_id) REFERENCES Customers(customer_id) ON DELETE SET NULL,
                        FOREIGN KEY (order_status_id) REFERENCES Order_Status(order_status_id) ON DELETE SET NULL,
                        FOREIGN KEY (payment_method_id) REFERENCES Payment_Methods(payment_method_id) ON DELETE SET NULL
);
