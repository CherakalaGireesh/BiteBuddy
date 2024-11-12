-- User_Roles Table
CREATE TABLE User_Roles (
                            role_id INT PRIMARY KEY AUTO_INCREMENT,
                            role_name VARCHAR(50) UNIQUE NOT NULL,
                            description TEXT,
                            permissions JSON, -- JSON object with specific permissions
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                            created_by INT, -- ID of the user who created this role
                            updated_by INT -- ID of the user who last updated this role
);

