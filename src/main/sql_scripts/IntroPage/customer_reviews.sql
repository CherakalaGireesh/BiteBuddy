CREATE TABLE customer_reviews (
                                  id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
                                  customer_name VARCHAR2(255) NOT NULL,
                                  rating NUMBER(3, 2) CHECK (rating BETWEEN 1.0 AND 5.0),
                                  review_text VARCHAR2(1000) NOT NULL,
                                  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE OR REPLACE TRIGGER UpdateCustomerReviewsTimestamp
BEFORE UPDATE ON customer_reviews
                  FOR EACH ROW
BEGIN
  :NEW.updated_at := CURRENT_TIMESTAMP;
END;
/

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Alice Johnson', 4.5, 'The food arrived hot and was absolutely delicious. I ordered the chicken Alfredo, and the sauce was creamy and flavorful. The portion size was perfect, and the garlic bread that came with it was fresh and crispy. Delivery was on time, and the packaging kept the food warm, which I really appreciated.\n\nHowever, I noticed that the delivery driver didn’t seem familiar with the area and had to call for directions. It wasn’t a big issue, but it slightly delayed the delivery. Overall, it was a great experience, and I would definitely order from here again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Bob Smith', 3.8, 'I decided to try this service because of the high ratings, and the food quality did not disappoint. I ordered a cheeseburger and fries, and both were tasty and well-prepared. The burger was juicy, and the fries were crispy and perfectly salted. I also liked the eco-friendly packaging they used for the delivery.\n\nUnfortunately, the delivery was about 15 minutes late, which is why I’m giving a slightly lower rating. The delay wasn’t communicated, which was a bit frustrating. I’d still recommend the service but hope they can improve on their timeliness.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Charlie Davis', 5.0, 'This is hands down the best food delivery experience I’ve had in a long time! I ordered sushi from my favorite restaurant, and it was delivered in perfect condition. The presentation was immaculate, and the taste was incredible. I appreciated the effort they put into ensuring the sushi was fresh and handled with care.\n\nThe delivery was also incredibly fast, arriving 10 minutes earlier than expected. The driver was polite and followed the contactless delivery instructions perfectly. I’m so impressed and will definitely use this service again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Diana Moore', 2.5, 'I had high hopes for this service, but I was disappointed with my experience. I ordered a pasta dish that arrived lukewarm, and the sauce had spilled into the bag, making it messy to handle. The taste was average at best, and I didn’t feel like it was worth the price.\n\nThe delivery was also late, and the driver didn’t apologize or explain the delay. I expected better communication and quality from a service with such good reviews. I’m hesitant to try them again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Ethan Brown', 4.2, 'The food was good, and the delivery was reasonably fast. I ordered a pepperoni pizza and some garlic knots, and both were enjoyable. The pizza had a generous amount of toppings, and the garlic knots were perfectly baked. It’s clear that the restaurant takes pride in the quality of their food.\n\nOne minor issue was that the delivery bag wasn’t insulated, so the food wasn’t as hot as I would have liked. It’s a small detail, but it does make a difference. Overall, a solid experience that I’d recommend to others.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Fiona Miller', 3.0, 'The delivery was very quick, which I appreciated, but the food itself was underwhelming. I ordered a Caesar salad and a side of chicken wings. While the salad was fresh and crisp, the dressing was too salty, and the portion size was smaller than I expected. The wings were flavorful, but they arrived cold, which was disappointing.\n\nThe delivery driver was friendly and professional, which was a highlight of the experience. However, I think there’s room for improvement in ensuring the food stays warm during transit. I’m not sure if I’ll order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('George Taylor', 4.7, 'What a fantastic meal! I ordered their signature burger and sweet potato fries, and everything was perfect. The burger was juicy, flavorful, and cooked to perfection. The sweet potato fries were crispy on the outside and soft on the inside. The food was delivered in well-packaged containers that kept everything fresh and warm.\n\nThe only slight downside was the delivery fee, which felt a bit high compared to other services. Still, the quality of the food and the speed of the delivery made it worth it. I will definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Hannah Wilson', 5.0, 'I can’t say enough good things about this service! I ordered a pad Thai and spring rolls, and both were incredible. The flavors were authentic, and the ingredients tasted fresh. The spring rolls were crispy and came with a delicious dipping sauce. Everything was perfectly packaged and still warm upon arrival.\n\nThe delivery was right on time, and the driver was courteous and followed instructions for contactless delivery. I’m extremely satisfied and will be recommending this service to my friends and family.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Isaac Martinez', 3.5, 'The food was decent, but there were a few issues. I ordered fried rice and dumplings, and while the rice was flavorful, the dumplings were soggy and lacked seasoning. It seemed like they had been sitting out for a while before being delivered, which was disappointing.\n\nThe delivery took longer than expected, and the driver didn’t update me on the delay. While the food wasn’t bad, I think there’s room for improvement in terms of both food quality and communication. I might give them another try in the future.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('James Lopez', 4.8, 'Amazing experience from start to finish! I ordered a steak dinner with mashed potatoes and vegetables, and it was absolutely delicious. The steak was cooked perfectly to my liking, and the sides were flavorful and fresh. The presentation of the food was also impressive, even for delivery.\n\nThe delivery was prompt, and the driver was very professional. I appreciate the attention to detail and the quality of service provided. This will definitely be my go-to service for future orders.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Katherine White', 4.0, 'I ordered a vegetarian burrito bowl, and it was quite tasty. The ingredients were fresh, and the flavors were well-balanced. The guacamole was a highlight—it tasted homemade and added a great touch to the meal. I also liked that the portions were generous enough to make it feel like good value for money.\n\nHowever, the packaging could have been better. The bowl was slightly dented, and some of the sauce had leaked into the delivery bag. Despite that, the food quality made up for it. I would recommend trying their vegetarian options.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Liam Green', 2.8, 'I was excited to try the service, but it didn’t quite meet my expectations. I ordered a grilled salmon meal, and while the fish was cooked well, the sides were bland and uninspired. The rice was undercooked, and the steamed vegetables were soggy and lacked seasoning. It was disappointing overall.\n\nThe delivery was also delayed by nearly 30 minutes, and I wasn’t informed of the delay. The driver was apologetic, which I appreciated, but the experience left me hesitant about ordering again. I hope they can improve in the future.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Mason Clark', 5.0, 'Outstanding service and food! I ordered a family meal with pasta, salad, and breadsticks, and everything was perfect. The pasta was rich and creamy, the salad was fresh and crisp, and the breadsticks were warm and buttery. It felt like a high-end dining experience right at home.\n\nThe delivery was punctual, and the driver was very polite. I also appreciated the thoughtful packaging that kept everything warm. I will definitely recommend this service to friends and family.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Natalie King', 3.9, 'The food was good, but there were a few hiccups. I ordered a spicy chicken wrap and fries. The wrap was flavorful, with a good amount of spice, but the fries were slightly soggy by the time they arrived. I think using better insulation could help with this issue.\n\nThe delivery was on time, which was great, and the driver was professional. Overall, I’d say it was a decent experience, but there’s room for improvement.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Oliver Scott', 4.6, 'This was my first time using this service, and I was pleasantly surprised. I ordered a barbecue ribs meal, and it was delicious! The ribs were tender and smoky, and the barbecue sauce was tangy and sweet. The coleslaw on the side added a nice crunch and balanced the meal well.\n\nThe delivery was quick, and the driver was friendly. Everything was packaged neatly, and the food was still warm. I’m impressed and will definitely use this service again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Penelope Harris', 4.3, 'I ordered a breakfast combo with pancakes, scrambled eggs, and bacon, and it was quite satisfying. The pancakes were fluffy and came with a generous portion of syrup. The eggs were cooked well, and the bacon was crispy, just the way I like it. It was a great way to start my morning.\n\nThe only downside was that the delivery was slightly late, which made me worry the food might have cooled down. Thankfully, it was still warm and delicious. I’d definitely consider ordering again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Quinn Wright', 3.2, 'I ordered a turkey sandwich with a side of chips, and while the sandwich was decent, the chips were stale. It felt like the chips had been sitting in the bag for a while before being delivered. The turkey was fresh, though, and the sandwich overall had good flavors.\n\nThe delivery took longer than expected, which was disappointing. The driver didn’t provide any updates, so I wasn’t sure when to expect my food. I hope they can improve their delivery times and quality control.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Rachel Adams', 4.9, 'Fantastic service! I ordered a dessert platter with cheesecake, brownies, and macarons, and everything was divine. The cheesecake was creamy, the brownies were fudgy, and the macarons were light and flavorful. It was the perfect treat to end the day.\n\nThe delivery was on time, and the driver was very courteous. The desserts were packed in a way that kept them intact, which I appreciated. I will definitely order from here again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Samuel Turner', 2.7, 'I had a less-than-stellar experience with my order. I got a grilled cheese sandwich and tomato soup, but the soup was lukewarm, and the sandwich was soggy. It seemed like the food had been sitting out for too long before being delivered.\n\nThe delivery was also late, and there was no communication about the delay. I was disappointed overall and hope they can improve their service in the future.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Tessa Parker', 5.0, 'Absolutely perfect! I ordered a seafood platter with shrimp, scallops, and lobster tail, and it was amazing. The seafood was fresh and cooked to perfection. The sides of garlic butter and lemon wedges added the perfect touch. It felt like dining at a five-star restaurant in the comfort of my home.\n\nThe delivery was on time, and the driver was friendly and professional. The food was packaged beautifully and still hot upon arrival. I couldn’t be happier with the service and will definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Uma Patel', 4.4, 'The food was delicious, and I was happy with the portion sizes. I ordered a vegetable biryani, and the spices were just right—not too overwhelming but flavorful enough to enjoy. The raita on the side was a nice touch, adding a cooling element to the meal.\n\nThe delivery arrived on time, and the food was still hot. My only minor complaint was that the packaging wasn’t entirely secure, and some rice had spilled. Overall, it was a great experience, and I’ll definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Victor Hernandez', 3.1, 'I tried their chicken shawarma wrap and fries. While the wrap was flavorful, it was a bit dry, and I would have liked more sauce. The fries were decent but not as crispy as I prefer. It was an okay meal but not something I’d rave about.\n\nThe delivery was also delayed by about 20 minutes, and there was no communication from the driver. This experience left me feeling a bit underwhelmed, and I hope they can address these issues.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Wendy Garcia', 4.8, 'I ordered a combo meal with fried chicken, coleslaw, and biscuits, and everything was fantastic. The chicken was crispy on the outside and juicy on the inside, and the coleslaw was fresh and creamy. The biscuits were buttery and soft—just perfect.\n\nThe delivery arrived ahead of schedule, and the driver was polite and professional. The food was still warm and well-packaged. I’m very impressed and will definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Xavier Brooks', 2.9, 'I was disappointed with my order of spaghetti and meatballs. The pasta was overcooked, and the sauce lacked flavor. The meatballs were okay but didn’t stand out. It felt like a rushed preparation, and I expected better quality for the price.\n\nThe delivery took longer than expected, and the driver seemed confused about the address. While the service was friendly, the overall experience fell short of my expectations.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Yasmine Hall', 5.0, 'Amazing service and delicious food! I ordered a Thai green curry with jasmine rice, and it was one of the best I’ve ever had. The curry was rich and flavorful, with just the right amount of spice. The rice was perfectly cooked and complemented the dish well.\n\nThe delivery was prompt, and the driver followed instructions for contactless delivery perfectly. The food arrived hot and in perfect condition. I’m thrilled with the experience and will definitely be a repeat customer.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Zachary Carter', 4.5, 'I tried their grilled chicken Caesar salad, and it was excellent. The chicken was tender and seasoned well, and the salad was fresh and crisp. The dressing was flavorful without being overpowering. It was a healthy and satisfying meal.\n\nThe delivery was timely, and the packaging ensured the food stayed fresh. My only suggestion would be to include a bit more dressing for larger portion sizes. Otherwise, it was a great experience.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Abigail Foster', 3.4, 'The food was decent but not exceptional. I ordered a club sandwich with a side of potato salad. While the sandwich had good ingredients, the bread was slightly stale, and the potato salad was bland. It didn’t feel like it was freshly prepared.\n\nThe delivery was fast, which I appreciated, but the quality of the food left me wanting more. I might give them another try, hoping for a better experience.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Brandon Cooper', 4.9, 'Fantastic experience! I ordered a steak and baked potato meal, and it was perfect. The steak was cooked to my specifications, and the potato was loaded with cheese and sour cream. It felt like a meal from a high-end restaurant delivered right to my door.\n\nThe delivery driver was courteous and arrived earlier than expected. The food was warm and packaged neatly. I couldn’t be happier with this experience.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Catherine Evans', 3.7, 'I ordered a veggie burger and sweet potato fries. The burger was tasty, with fresh ingredients and a flavorful patty, but the fries were cold and soggy. It seemed like they had been prepared too early and left sitting before delivery.\n\nThe delivery was on time, but the lack of insulation for the fries was disappointing. Overall, it was a decent meal, but there’s room for improvement.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Daniel Morgan', 5.0, 'Exceptional service! I ordered a gourmet pizza with truffle oil and prosciutto, and it was incredible. The crust was thin and crispy, the toppings were fresh and flavorful, and the truffle oil added a luxurious touch. It was worth every penny.\n\nThe delivery was fast, and the driver was very professional. The pizza arrived hot and was well-packaged. I’m extremely satisfied and will be ordering again soon.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Emily Ramirez', 4.2, 'I ordered a Mediterranean platter with hummus, falafel, and pita bread. The hummus was creamy and flavorful, and the falafel was crispy on the outside and soft on the inside. The pita bread was fresh and warm, making the meal very enjoyable.\n\nThe delivery was on time, and the food was well-packaged. My only minor complaint is that the portion sizes could have been slightly larger. Still, I would order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Felix Scott', 3.0, 'I was looking forward to my meal, but it didn’t quite live up to my expectations. I ordered a BBQ pulled pork sandwich, and while the pork was tender, the sauce was overly sweet and masked the flavor of the meat. The coleslaw on the side was also too watery.\n\nThe delivery was punctual, but the packaging wasn’t great—some sauce had leaked into the bag. I hope they can improve both the food and packaging in the future.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Grace Thompson', 5.0, 'Incredible service and delicious food! I ordered a spicy ramen bowl, and it was absolutely amazing. The broth was rich and flavorful, with just the right amount of spice. The noodles were perfectly cooked, and the toppings were fresh and well-balanced.\n\nThe delivery was on time, and the driver was polite and followed my instructions for leaving the package at the door. The food arrived hot and in perfect condition. I’m extremely satisfied and will definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Henry Edwards', 4.6, 'I ordered a classic cheeseburger with fries, and it was one of the best I’ve had. The burger was juicy, with fresh toppings and a perfectly toasted bun. The fries were crispy and seasoned well, complementing the burger nicely.\n\nThe delivery was quick, and the food arrived hot and fresh. My only suggestion would be to include ketchup packets with the order, but that’s a minor detail. I’ll definitely be ordering again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Isabelle Lewis', 3.8, 'The food was good, but there were a few issues. I ordered a chicken Caesar wrap and a smoothie. The wrap was fresh and tasty, but the smoothie was warm by the time it arrived, which was disappointing. It seemed like the insulation for the drink could have been better.\n\nThe delivery was on time, and the driver was professional. Overall, it was a decent experience, but I hope they can improve the packaging for drinks.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Jack Hughes', 4.9, 'Amazing meal! I ordered a seafood linguine, and it was perfect. The pasta was cooked al dente, and the seafood was fresh and flavorful. The sauce was rich and had a great balance of garlic and herbs. It felt like a dish straight from a fine dining restaurant.\n\nThe delivery was on time, and the food was packaged beautifully. I’m very impressed and can’t wait to order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Kylie Perez', 4.0, 'The food was enjoyable, but there were minor issues. I ordered a breakfast sandwich with avocado and eggs, and while the ingredients were fresh, the bread was slightly over-toasted. The coffee I ordered on the side was delicious, though, and complemented the meal well.\n\nThe delivery was prompt, and the driver was friendly. Overall, it was a good experience, and I’ll likely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Liam Foster', 2.6, 'I had high hopes for the meal, but it fell short. I ordered a chicken stir-fry, and while the vegetables were fresh, the sauce was too salty and overpowered the dish. The rice was also undercooked, which made the meal less enjoyable.\n\nThe delivery was late, and the driver didn’t provide any updates. I hope they can improve both their food quality and communication.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Mia Roberts', 5.0, 'Excellent food and service! I ordered a taco platter with various fillings, and every single one was delicious. The ingredients were fresh, and the flavors were authentic. The presentation was also impressive, even for a delivery order.\n\nThe delivery was fast, and the driver was courteous. Everything was packaged perfectly and arrived in great condition. I’m thoroughly impressed and will be ordering again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Nathan Bell', 4.4, 'The food was delicious and arrived on time. I ordered a salmon teriyaki bowl, and the fish was cooked perfectly. The sauce was flavorful without being overpowering, and the rice and vegetables complemented the dish well.\n\nThe only minor issue was that the portion size felt a bit small for the price. Still, I would highly recommend this service for the quality of the food.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Olivia Ward', 3.5, 'I ordered a BLT sandwich and a side of chips. The sandwich was fresh, with crispy bacon and ripe tomatoes, but the chips were stale, which detracted from the overall experience. It felt like they weren’t stored properly before being packed.\n\nThe delivery was quick, and the driver was polite. I’d recommend the sandwiches but hope they can improve the quality of the sides.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Patrick Rivera', 5.0, 'Amazing experience! I ordered a gourmet burger with truffle fries, and it was incredible. The burger was juicy, with a perfect balance of toppings and a soft, toasted bun. The truffle fries were crispy and full of flavor.\n\nThe delivery was on time, and the food was hot and well-packaged. I couldn’t be happier with the service and will definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Quinn Bennett', 4.7, 'The food was excellent, and I was very happy with the experience. I ordered a chicken Alfredo pasta, and it was creamy, rich, and flavorful. The portion size was generous, and the garlic bread on the side was soft and buttery, making it a perfect complement.\n\nThe delivery was fast, and the driver was courteous. The food arrived hot and was packaged neatly. I would highly recommend this service to anyone looking for quality food.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Rebecca Morris', 3.3, 'I ordered a breakfast platter with pancakes, eggs, and sausage. While the pancakes were fluffy and delicious, the eggs were slightly overcooked, and the sausage lacked seasoning. It wasn’t bad, but it didn’t feel worth the price either.\n\nThe delivery was on time, and the food was packaged well. Overall, it was an average experience, and I might give them another try in the future.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Sophia Collins', 4.5, 'Fantastic service and food! I tried their sushi platter, and it was fresh, flavorful, and beautifully presented. The variety of rolls was great, and the soy sauce and wasabi were just the right amount. It felt like dining in a high-end sushi bar from the comfort of home.\n\nThe delivery was prompt, and the food arrived cold, just as it should be. I’m very impressed and will definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Thomas Phillips', 3.8, 'I ordered a roast beef sandwich and potato wedges. The sandwich was tasty, with tender beef and fresh bread, but the potato wedges were cold and soggy. It seemed like the wedges weren’t kept warm during delivery.\n\nThe delivery was on time, and the driver was polite. While the sandwich was good, I hope they improve the sides to enhance the overall experience.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Uma Stewart', 5.0, 'Exceptional service! I ordered a grilled salmon meal with asparagus and mashed potatoes, and everything was perfect. The salmon was flaky and flavorful, the asparagus was fresh and crisp, and the mashed potatoes were creamy and buttery.\n\nThe delivery was on time, and the driver was very professional. The food was hot and beautifully packaged. I’ll definitely be a repeat customer and recommend this service to others.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Victor Howard', 4.1, 'I ordered a spicy chicken pizza, and it was delicious. The crust was thin and crispy, and the toppings were fresh and flavorful. The spice level was just right for my taste, and the cheese was perfectly melted.\n\nThe delivery was fast, but the pizza was slightly tilted in the box, which caused some of the toppings to shift. It didn’t affect the taste, but better packaging could help prevent this. Overall, it was a great meal.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Wanda Diaz', 3.6, 'The food was good, but there’s room for improvement. I ordered a Caesar salad with grilled chicken, and while the chicken was flavorful, the salad itself was a bit underwhelming. The dressing was too thick and didn’t coat the lettuce evenly.\n\nThe delivery was on time, and the packaging was neat. I’d recommend the chicken dishes but hope they can work on improving their salads.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Xander Mitchell', 4.9, 'Amazing experience! I ordered a barbecue ribs platter, and it exceeded my expectations. The ribs were tender and smoky, with a delicious barbecue sauce. The sides of cornbread and coleslaw were fresh and complemented the meal perfectly.\n\nThe delivery was prompt, and the driver was very friendly. The food was packaged securely and arrived hot. I couldn’t be happier and will definitely order again.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Yara Foster', 3.2, 'I ordered a grilled vegetable wrap, and while it was decent, it wasn’t memorable. The vegetables were fresh, but the wrap lacked seasoning and flavor. It felt like it needed a sauce or dressing to bring everything together.\n\nThe delivery was on time, but the food was slightly cold upon arrival. It was an average experience, and I might try a different dish next time.');

INSERT INTO customer_reviews (customer_name, rating, review_text)
VALUES ('Zane Brooks', 5.0, 'Outstanding service and food quality! I ordered a surf-and-turf meal with steak and shrimp, and it was phenomenal. The steak was cooked to perfection, and the shrimp were fresh and flavorful. The sides of mashed potatoes and green beans were equally impressive.\n\nThe delivery was on time, and the food was packaged beautifully. I’m extremely satisfied and will highly recommend this service to everyone I know.');


