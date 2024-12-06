CREATE TABLE customer_reviews (
    id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
    customer_name VARCHAR2(255) NOT NULL,
    rating NUMBER(3,2) CHECK raging BETWEEN 1.0 AND 5.0,
    review_text VARCHAR2(1000) NOT NULL

)