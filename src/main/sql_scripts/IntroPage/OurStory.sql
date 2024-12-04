CREATE TABLE OurStory (
                          id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
                          image_base_path VARCHAR2(100) DEFAULT 'D:\\PROJECTS\\BiteBuddyImages\\AboutUs\\OurStory',
                          image_name VARCHAR2(255) NOT NULL,
                          caption VARCHAR2(250) NOT NULL,
                          description VARCHAR2(500) NOT NULL,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE TRIGGER UpdateOurStoryTimestamp
    BEFORE UPDATE ON OurStory
                      FOR EACH ROW
BEGIN
    :NEW.updated_at := CURRENT_TIMESTAMP;
END;

INSERT INTO OurStory (image_name, caption, description)
VALUES ('our_story_milestone.jpg', 'The Beginning of Our Journey', 'Our food delivery service began with a vision to make meals accessible to everyone. Over time, we’ve built a loyal customer base, driven by our commitment to excellent service. We’ve faced challenges, but each milestone has shaped our company into what it is today.');

INSERT INTO OurStory (image_name, caption, description)
VALUES ('story_growth_travel.jpg', 'The Road to Success', 'The journey from a small startup to a widely recognized name in the food delivery industry wasn’t easy. With every success, we’ve adapted and innovated, ensuring that our customers have a seamless experience every time they order from us.');

INSERT INTO OurStory (image_name, caption, description)
VALUES ('our_story_network_expansion.jpg', 'Expanding Our Reach', 'From our initial operations to covering multiple cities, our story is about growth and community. As we expanded, we stayed focused on offering fast, reliable, and quality service, reaching more customers with each passing year.');

INSERT INTO OurStory (image_name, caption, description)
VALUES ('innovation_in_technology.jpg', 'The Power of Innovation', 'Technology has played a huge role in our success. We continuously innovate our platform, delivery systems, and processes to ensure that our customers have the best experience. From ordering to delivery, everything is designed to be fast and efficient.');
