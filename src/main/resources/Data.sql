
-- Create 2 users, 1 for each group member
INSERT INTO MY_USER_DETAILS(id, USERNAME, PASSWORD, ROLES)
SELECT 1, 'alex', 'pass', 'USER'
WHERE NOT EXISTS
(SELECT 1 FROM MY_USER_DETAILS WHERE USERNAME= 'alex');

INSERT INTO MY_USER_DETAILS(id, USERNAME, PASSWORD, ROLES)
SELECT 2, 'joyce', 'pass', 'USER'
WHERE NOT EXISTS
(SELECT 1 FROM MY_USER_DETAILS WHERE USERNAME= 'joyce');

-- Create admin user
INSERT INTO MY_USER_DETAILS(id, USERNAME, PASSWORD, ROLES)
SELECT 3, 'admin', 'pass', 'ADMIN'
WHERE NOT EXISTS
(SELECT 1 FROM MY_USER_DETAILS WHERE USERNAME= 'admin');


-- Create 5 books
INSERT INTO Book (id, name, author) VALUES (1, 'Book 1', 'Author 1');
INSERT INTO Book (id, name, author) VALUES (2, 'Book 2', 'Author 2');
INSERT INTO Book (id, name, author) VALUES (3, 'Book 3', 'Author 3');
INSERT INTO Book (id, name, author) VALUES (4, 'Book 4', 'Author 4');
INSERT INTO Book (id, name, author) VALUES (5, 'Book 5', 'Author 5');


-- 
-- -- Inserting two reviews for book with ID 1
-- INSERT INTO Review (id, bookId, review) VALUES (1, 1, 'Review 1 for Book 1');
-- INSERT INTO Review (id, bookId, review) VALUES (2, 1, 'Review 2 for Book 1');
-- 
-- -- Inserting two reviews for book with ID 2
-- INSERT INTO Review (id, bookId, review) VALUES (3, 2, 'Review 1 for Book 2');
-- INSERT INTO Review (id, bookId, review) VALUES (4, 2, 'Review 2 for Book 2');
-- 
-- -- Inserting two reviews for book with ID 3
-- INSERT INTO Review (id, bookId, review) VALUES (5, 3, 'Review 1 for Book 3');
-- INSERT INTO Review (id, bookId, review) VALUES (6, 3, 'Review 2 for Book 3');
-- 
-- -- Inserting two reviews for book with ID 4
-- INSERT INTO Review (id, bookId, review) VALUES (7, 4, 'Review 1 for Book 4');
-- INSERT INTO Review (id, bookId, review) VALUES (8, 4, 'Review 2 for Book 4');
-- 
-- -- Inserting two reviews for book with ID 5
-- INSERT INTO Review (id, bookId, review) VALUES (9, 5, 'Review 1 for Book 5');
-- INSERT INTO Review (id, bookId, review) VALUES (10, 5, 'Review 2 for Book 5');
