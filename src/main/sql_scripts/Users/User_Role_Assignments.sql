-- User_Role_Assignments Table
CREATE TABLE User_Role_Assignments (
                                       assignment_id INT PRIMARY KEY AUTO_INCREMENT,
                                       user_id INT NOT NULL,
                                       role_id INT NOT NULL,
                                       assigned_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                       assigned_by INT, -- ID of the user who assigned this role
                                       expiration_date TIMESTAMP, -- Expiration of the role assignment
                                       is_active BOOLEAN DEFAULT TRUE, -- Flag to enable/disable role assignment
                                       FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
                                       FOREIGN KEY (role_id) REFERENCES User_Roles(role_id) ON DELETE CASCADE
);
