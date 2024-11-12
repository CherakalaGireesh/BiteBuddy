-- User_Profiles Table
CREATE TABLE User_Profiles (
    profile_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    first_name VARCHAR(50),
    middle_name VARCHAR(50),
    last_name VARCHAR(50),
    gender ENUM('male', 'female', 'other'),
    email VARCHAR(100) UNIQUE,
    phone_number VARCHAR(20),
    alternative_phone_number VARCHAR(20),
    address TEXT,
    city VARCHAR(50),
    state VARCHAR(50),
    postal_code VARCHAR(20),
    country VARCHAR(50),
    date_of_birth DATE,
    profile_image_url VARCHAR(255), -- URL to the profile image
    bio TEXT, -- Short biography or description
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE
);

