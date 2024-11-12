CREATE TABLE Slide_Transitions (
                                   transition_id NUMBER PRIMARY KEY,
                                   name VARCHAR2(100) NOT NULL,
                                   description CLOB,
                                   duration NUMBER NOT NULL -- duration in milliseconds
);

CREATE SEQUENCE transition_seq START WITH 1 INCREMENT BY 1;

