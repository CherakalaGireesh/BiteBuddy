-- Users Table
CREATE TABLE Users (
                       user_id INT PRIMARY KEY AUTO_INCREMENT,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       password_hash VARCHAR(255) NOT NULL,
                       salt VARCHAR(255), -- Salt for password hashing
                       email VARCHAR(100) NOT NULL UNIQUE,
                       account_status ENUM('active', 'inactive', 'suspended', 'pending') DEFAULT 'active',
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                       last_login TIMESTAMP, -- Last login timestamp
                       created_by INT, -- ID of the user who created this account
                       updated_by INT, -- ID of the user who last updated this account
                       is_deleted BOOLEAN DEFAULT FALSE -- Soft delete flag
);
