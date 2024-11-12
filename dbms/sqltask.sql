CREATE TABLE Authors (
    author_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE Books (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author_id INT,
    publication_year YEAR,
    price DECIMAL(10, 2),
    FOREIGN KEY (author_id) REFERENCES Authors(author_id)
);


CREATE TABLE Borrowers (
    borrower_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    dob DATE
);

CREATE TABLE Loans (
    loan_id INT AUTO_INCREMENT PRIMARY KEY,
    borrower_id INT,
    book_id INT,
    loan_date DATE,
    return_date DATE,
    FOREIGN KEY (borrower_id) REFERENCES Borrowers(borrower_id),
    FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

INSERT INTO Authors (first_name, last_name) VALUES
    ('George', 'Orwell'),
    ( 'F' ,'Scott Fitzgerald'),
    ('Mark', 'Twain'),
    ('J.K.', 'Rowling'),
    ('Herman','Melville');

INSERT INTO Borrowers (first_name, last_name, email, dob) VALUES
    ('Alice', 'Smith', 'alice.smith@example.com', '1990-05-15'),
    ('Bob', 'Jones', 'bob.jones@example.com', '1985-07-22'),
    ('Charlie', 'Brown', 'charlie.brown@example.com', '1992-10-05'),
    ('Daisy', 'Johnson', 'daisy.johnson@example.com', '1988-03-12'),
    ('Ethan', 'Hunt', 'ethan.hunt@example.com', '1975-08-30');


INSERT INTO Books (title, author_id, publication_year, price) VALUES
    ('1984', 1, 1949, 19.99),
    ('The Great Gatsby', 2, 1913, 9.99),
    ('The Adventures of Tom Sawyer', 3, 1976, 14.99),
    ('Harry Potter and the Sorcerer''s Stone', 4, 1997, 29.99),
    ('Moby Dick', 5, 1934, 12.99);

INSERT INTO Loans (borrower_id, book_id, loan_date, return_date) VALUES
    (1, 1, '1980-10-01', '2024-10-15'),
    (2, 2, '2024-10-05', '2024-10-20'),
    (3, 3, '2023-10-10', '2024-10-25'),
    (4, 4, '2023-10-15', '2024-10-30'),
    (5, 5, '2024-10-20', '2024-11-05');
    
select * from Books;
    
select title,price,publication_year from Books where price>20;
    
select first_name,last_name,email from Borrowers where borrower_id in(select borrower_id from Loans where Loan_date>'2024-01-01');
    
update Books set price=25.00 where title = 'The Great Gatsby';
    
DELETE FROM Loans WHERE book_id = (SELECT book_id FROM Books WHERE title = "Moby Dick");  
    
delete from Books where title="Moby Dick";  
    
alter table Books add genre VARCHAR(50);
    
select count(*) from Borrowers;
    
select sum(price) from Books;
    
select avg(price) from Books;
    
select * from Books where book_id in (
select book_id from Loans where borrower_id in (
select borrower_id from Borrowers where timestampdiff(year,dob,CURDATE())>30));