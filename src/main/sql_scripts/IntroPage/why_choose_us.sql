CREATE TABLE why_choose_us (
    id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
    image_base_path VARCHAR2(100) DEFAULT 'D:\\PROJECTS\\BiteBuddyImages\\WhyChooseUs\\',
    image_name VARCHAR(255) NOT NULL,
    caption VARCHAR(255) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE TRIGGER UpdateWhyChooseUsTimestamp
BEFORE UPDATE ON why_choose_us
                  FOR EACH ROW
BEGIN
  :NEW.updated_at := CURRENT_TIMESTAMP;
END;
/


INSERT INTO why_choose_us (image_name, caption, description)
VALUES
('fresh_ingredients.jpg', 'Fresh Ingredients',
 'We use only the freshest ingredients to prepare our dishes, ensuring the highest quality and flavor in every bite.');

INSERT INTO why_choose_us (image_name, caption, description)
VALUES
    ('fast_delivery.jpg', 'Fast Delivery',
     'Our delivery service is quick and reliable, so your food arrives hot and fresh, right at your doorstep.');

INSERT INTO why_choose_us (image_name, caption, description)
VALUES
    ('affordable_prices.jpg', 'Affordable Prices',
     'We offer delicious meals at prices that won’t break your budget. Enjoy gourmet food without the gourmet price.');

INSERT INTO why_choose_us (image_name, caption, description)
VALUES
    ('customer_service.jpg', 'Excellent Customer Service',
     'Our friendly and professional team is always available to ensure your dining experience is nothing short of exceptional.');

INSERT INTO why_choose_us (image_name, caption, description)
VALUES
    ('wide_menu.jpg', 'Wide Menu Selection',
     'We offer a wide variety of dishes to suit every taste, including vegetarian, vegan, gluten-free, and more!');


