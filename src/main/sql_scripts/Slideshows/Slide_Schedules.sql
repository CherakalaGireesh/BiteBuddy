CREATE TABLE Slide_Schedules (
                                 schedule_id NUMBER PRIMARY KEY,
                                 slide_id NUMBER NOT NULL,
                                 day_of_week VARCHAR2(10) CHECK (day_of_week IN ('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday')),
                                 start_time TIMESTAMP WITH TIME ZONE,
                                 end_time TIMESTAMP WITH TIME ZONE,
                                 FOREIGN KEY (slide_id) REFERENCES Slides(slide_id) ON DELETE CASCADE
);

CREATE SEQUENCE schedule_seq START WITH 1 INCREMENT BY 1;

