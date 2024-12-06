CREATE TABLE our_promises (
                            id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
                            image_base_path VARCHAR2(100) DEFAULT 'D:\\PROJECTS\\BiteBuddyImages\\AboutUs\\OurPromises',
                            image_name VARCHAR2(255) NOT NULL,
                            caption VARCHAR2(250) NOT NULL,
                            description VARCHAR2(500) NOT NULL,
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE TRIGGER UpdateOurPromisesTimestamp
    BEFORE UPDATE ON our_promises
                      FOR EACH ROW
BEGIN
    :NEW.updated_at := CURRENT_TIMESTAMP;
END;


INSERT INTO our_promises (image_name, caption, description)
VALUES ('promise_fast_delivery.jpg', 'Fast Delivery', 'We promise to deliver your food quickly and efficiently, ensuring that every meal arrives at your doorstep hot and fresh. Our commitment to speed is integral to providing the best possible service.');

INSERT INTO our_promises (image_name, caption, description)
VALUES ('promise_customer_satisfaction.jpg', 'Customer Satisfaction', 'Our goal is to exceed customer expectations with every order. From our easy-to-use app to our friendly delivery staff, we are committed to providing an exceptional experience every time.');

INSERT INTO our_promises (image_name, caption, description)
VALUES ('promise_sustainable_practices.jpg', 'Sustainable Practices', 'We are committed to sustainability in every aspect of our business. From eco-friendly packaging to reducing food waste, we strive to make a positive impact on the environment while delivering the best food.');

INSERT INTO our_promises (image_name, caption, description)
VALUES ('promise_high_quality_meals.jpg', 'Fresh and High-Quality Meals', 'We guarantee fresh, high-quality meals that are sourced from trusted suppliers. Each meal is carefully prepared to ensure that it meets our high standards and is delivered at its peak freshness.');
