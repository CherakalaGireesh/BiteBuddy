-- User_Sessions Table
CREATE TABLE User_Sessions (
                               session_id INT PRIMARY KEY AUTO_INCREMENT,
                               user_id INT NOT NULL,
                               session_token VARCHAR(255) UNIQUE NOT NULL,
                               ip_address VARCHAR(45),
                               device_info TEXT, -- Device information
                               browser_info VARCHAR(100), -- Browser details
                               os_info VARCHAR(100), -- Operating System details
                               login_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                               logout_time TIMESTAMP NULL,
                               is_active BOOLEAN DEFAULT TRUE,
                               last_accessed TIMESTAMP, -- Timestamp of last activity in the session
                               location VARCHAR(100), -- Geolocation information
                               FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE
);
