CREATE TABLE WhyChooseUs (
    id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
    image_base_path VARCHAR2(100) DEFAULT 'D:\\PROJECTS\\BiteBuddyImages\\WhyChooseUs\\',
    image_name VARCHAR(255) NOT NULL,
    caption VARCHAR(255) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    background_color VARCHAR(7) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE TRIGGER UpdateWhyChooseUsTimestamp
BEFORE UPDATE ON WhyChooseUs
                  FOR EACH ROW
BEGIN
  :NEW.updated_at := CURRENT_TIMESTAMP;
END;
/


INSERT INTO WhyChooseUs (image_name, caption, description, background_color)
VALUES
('fresh_ingredients.jpg', 'Fresh Ingredients',
 'We use only the freshest ingredients to prepare our dishes, ensuring the highest quality and flavor in every bite.', '#FFDDC1');

INSERT INTO WhyChooseUs (image_name, caption, description, background_color)
VALUES
    ('fast_delivery.jpg', 'Fast Delivery',
     'Our delivery service is quick and reliable, so your food arrives hot and fresh, right at your doorstep.', '#FFEB99');

INSERT INTO WhyChooseUs (image_name, caption, description, background_color)
VALUES
    ('affordable_prices.jpg', 'Affordable Prices',
     'We offer delicious meals at prices that won’t break your budget. Enjoy gourmet food without the gourmet price.', '#DFFFD6');

INSERT INTO WhyChooseUs (image_name, caption, description, background_color)
VALUES
    ('customer_service.jpg', 'Excellent Customer Service',
     'Our friendly and professional team is always available to ensure your dining experience is nothing short of exceptional.', '#FAD02E');

INSERT INTO WhyChooseUs (image_name, caption, description, background_color)
VALUES
    ('wide_menu.jpg', 'Wide Menu Selection',
     'We offer a wide variety of dishes to suit every taste, including vegetarian, vegan, gluten-free, and more!', '#F28D35');


