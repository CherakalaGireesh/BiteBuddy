-- Password_Recovery Table
CREATE TABLE Password_Recovery (
                                   recovery_id INT PRIMARY KEY AUTO_INCREMENT,
                                   user_id INT NOT NULL,
                                   reset_token VARCHAR(255) UNIQUE NOT NULL,
                                   token_status ENUM('active', 'used', 'expired') DEFAULT 'active',
                                   expiration_time TIMESTAMP NOT NULL,
                                   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                   created_by INT, -- ID of the admin who generated the reset token, if applicable
                                   last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                   updated_by INT, -- ID of the user/admin who last updated the status
                                   ip_address VARCHAR(45), -- IP address of the user requesting reset
                                   location VARCHAR(100), -- Geolocation of the request
                                   FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE
);
