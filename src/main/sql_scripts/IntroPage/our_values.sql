CREATE TABLE our_values (
                           id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
                           image_base_path VARCHAR2(100) DEFAULT 'D:\\PROJECTS\\BiteBuddyImages\\AboutUs\\OurValues',
                           image_name VARCHAR2(255) NOT NULL,
                           caption VARCHAR2(250) NOT NULL,
                           description VARCHAR2(500) NOT NULL,
                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                           updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE TRIGGER UpdateOurValuesTimestamp
    BEFORE UPDATE ON our_values
                      FOR EACH ROW
BEGIN
    :NEW.updated_at := CURRENT_TIMESTAMP;
END;


INSERT INTO our_values (image_name, caption, description)
VALUES ('value_customer_focus.jpg', 'Customer First', 'Our top priority has always been the customer. We work tirelessly to ensure that every meal delivered exceeds expectations, ensuring the satisfaction and happiness of every individual who orders from us.');

INSERT INTO our_values (image_name, caption, description)
VALUES ('value_commitment_quality.jpg', 'Commitment to Quality', 'Every meal we deliver is prepared with the highest quality ingredients. Our commitment to quality ensures that each order meets our rigorous standards for taste, freshness, and presentation, every time.');

INSERT INTO our_values (image_name, caption, description)
VALUES ('value_innovation_drive.jpg', 'Innovation', 'We believe in constant innovation to provide a better experience. By embracing new technology and innovative ideas, we continue to streamline our services and stay ahead of industry trends, all while keeping customer convenience at the forefront.');

INSERT INTO our_values (image_name, caption, description)
VALUES ('value_sustainability_efforts.jpg', 'Sustainability', 'We are committed to minimizing our environmental impact. From using eco-friendly packaging to supporting sustainable farming practices, we actively work toward a greener, more sustainable future in every aspect of our business.');
