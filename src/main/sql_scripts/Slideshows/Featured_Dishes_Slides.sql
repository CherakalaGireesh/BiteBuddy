CREATE TABLE Featured_Dishes_Slides (
                                        slide_id NUMBER GENERATED BY DEFAULT AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
                                        slideshow_id NUMBER NOT NULL,
                                        image_url VARCHAR2(255) NOT NULL,
                                        caption VARCHAR2(200) NOT NULL, -- Dish name
                                        description CLOB, -- Description of the dish
                                        price NUMBER(10,2), -- Price of the dish
                                        category VARCHAR2(50), -- Category of the dish (e.g., appetizer, main course)
                                        link_url VARCHAR2(255), -- Link to order the dish
                                        display_order NUMBER,
                                        start_date TIMESTAMP WITH TIME ZONE,
                                        end_date TIMESTAMP WITH TIME ZONE,
                                        status VARCHAR2(10) DEFAULT 'active' CHECK (status IN ('active', 'inactive')),
                                        FOREIGN KEY (slideshow_id) REFERENCES Slideshows(slideshow_id) ON DELETE CASCADE
);