CREATE TABLE OurMission (
                            id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
                            image_base_path VARCHAR2(100) DEFAULT 'D:\\PROJECTS\\BiteBuddyImages\\AboutUs\\OurMission',
                            image_name VARCHAR2(255) NOT NULL,
                            caption VARCHAR2(250) NOT NULL,
                            description VARCHAR2(500) NOT NULL,
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE TRIGGER UpdateOurMissionTimestamp
    BEFORE UPDATE ON OurMission
    FOR EACH ROW
BEGIN
    :NEW.updated_at := CURRENT_TIMESTAMP;
END;
/


INSERT INTO OurMission (image_name, caption, description)
VALUES (
           'nourishing_lives.jpg',
           'Nourishing Lives, One Meal at a Time',
           'Delivering delicious and wholesome meals to bring joy and nourishment to every customer, ensuring a delightful dining experience at home.'
       );

INSERT INTO OurMission (image_name, caption, description)
VALUES (
           'empowering_talent.jpg',
           'Empowering Local Culinary Talent',
           'Connecting local chefs and restaurants to a wider audience, fostering authentic flavors and supporting small businesses.'
       );

INSERT INTO OurMission (image_name, caption, description)
VALUES (
           'health_and_safety.jpg',
           'Your Health and Safety, Our Priority',
           'Upholding the highest standards of hygiene and safety to deliver meals you can trust, every single time.'
       );

INSERT INTO OurMission (image_name, caption, description)
VALUES (
           'sustainability_focus.jpg',
           'Sustainability in Every Bite',
           'Promoting eco-friendly practices through reduced waste and sustainable sourcing to make every meal environmentally responsible.'
       );

INSERT INTO OurMission (image_name, caption, description)
VALUES (
           'global_flavors.jpg',
           'Global Flavors, Local Comfort',
           'Bringing the world’s cuisines to your doorstep, making it easy to explore diverse flavors from the comfort of home.'
       );
