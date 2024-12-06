CREATE TABLE our_team_members (
                         id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
                         image_base_path VARCHAR2(100) DEFAULT 'D:\\PROJECTS\\BiteBuddyImages\\AboutUs\\OurTeamMembers',
                         image_name VARCHAR2(255) NOT NULL,
                         name VARCHAR2(100) NOT NULL,
                         role VARCHAR2(150) NOT NULL,
                         caption VARCHAR2(250) NOT NULL,
                         description VARCHAR2(500) NOT NULL,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE TRIGGER UpdateOurTeamTimestamp
    BEFORE UPDATE ON our_team_members
                      FOR EACH ROW
BEGIN
    :NEW.updated_at := CURRENT_TIMESTAMP;
END;


INSERT INTO our_team_members (image_name, name, role, caption, description)
VALUES ('team_member_ceo.jpg', 'John Doe', 'Chief Executive Officer (CEO)', 'Leading the company with vision and determination.', 'With over 15 years of experience, John has driven the company to new heights, continuously innovating and expanding our services to better meet the needs of our customers.');

INSERT INTO our_team_members (image_name, name, role, caption, description)
VALUES ('team_member_operations_manager.jpg', 'Jane Smith', 'Operations Manager', 'Ensuring smooth daily operations.', 'Jane is the backbone of our operations, overseeing everything from logistics to customer support. Her focus on efficiency and timeliness ensures every order arrives on schedule.');

INSERT INTO our_team_members (image_name, name, role, caption, description)
VALUES ('team_member_marketing_director.jpg', 'Emma Lee', 'Marketing Director', 'Connecting with our customers.', 'Emma’s marketing expertise has played a major role in growing our brand and strengthening customer loyalty. Her creative campaigns continue to resonate with our ever-expanding audience.');

INSERT INTO our_team_members (image_name, name, role, caption, description)
VALUES ('team_member_cto.jpg', 'Liam Brown', 'Chief Technology Officer (CTO)', 'Innovating through technology.', 'Liam is responsible for the technological advancements that allow us to provide a seamless customer experience. His team ensures our platform runs smoothly and securely for all users.');
