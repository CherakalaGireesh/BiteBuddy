CREATE TABLE Slideshow_Transitions (
                                       id NUMBER PRIMARY KEY,
                                       slideshow_id NUMBER NOT NULL,
                                       transition_id NUMBER NOT NULL,
                                       FOREIGN KEY (slideshow_id) REFERENCES Slideshows(slideshow_id) ON DELETE CASCADE,
                                       FOREIGN KEY (transition_id) REFERENCES Slide_Transitions(transition_id) ON DELETE SET NULL
);

CREATE SEQUENCE slideshow_transition_seq START WITH 1 INCREMENT BY 1;

