create table Customers(
customer_id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
phone_number VARCHAR(10) UNIQUE NOT NULL,
address VARCHAR(50) NOT NULL
);
CREATE TABLE Rooms (
    room_id INT AUTO_INCREMENT PRIMARY KEY,
    room_type VARCHAR(20),
    price_per_night DECIMAL(10, 2),
    stats VARCHAR(20) NOT NULL,
    floor_number INT
);
CREATE TABLE Reservations (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    room_id INT,
    reservation_date DATE,
    check_in_date DATE,
    check_out_date DATE,
    stats VARCHAR(20) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);

CREATE TABLE Payments (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    reservation_id INT,
    payment_date DATE,
    amount_paid DECIMAL(10, 2),
    payment_method VARCHAR(20) NOT NULL,
    FOREIGN KEY (reservation_id) REFERENCES Reservations(reservation_id)
);
CREATE TABLE Staff (
    staff_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    Staff_role VARCHAR(20) NOT NULL,
    hire_date DATE
);
CREATE TABLE RoomAssignments (
    assignment_id INT AUTO_INCREMENT PRIMARY KEY,
    staff_id INT,
    room_id INT,
    assignment_date DATE,
    task_description VARCHAR(255),
    FOREIGN KEY (staff_id) REFERENCES Staff(staff_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);


INSERT INTO Customers (first_name, last_name, email, phone_number, address)
VALUES
('Alice', 'Smith', 'alice@example.com', '1234567890', '123 Main St'),
('Bob', 'Jones', 'bob@example.com', '0987654321', '456 Elm St'),
('Charlie', 'Brown', 'charlie@example.com', '1112223333', '789 Oak St'),
('Daisy', 'Johnson', 'daisy@example.com', '4445556666', '321 Maple St'),
('Ethan', 'Hunt', 'ethan@example.com', '7778889999', '654 Pine St');

INSERT INTO Rooms (room_type, price_per_night, stats, floor_number)
VALUES
('single', 100.00, 'available', 1),
('double', 150.00, 'available', 2),
('suite', 300.00, 'occupied', 3),
('double', 150.00, 'under maintenance', 4),
('suite', 300.00, 'available', 5);

INSERT INTO Reservations (customer_id, room_id, reservation_date, check_in_date, check_out_date, stats)
VALUES
(1, 1, '2024-01-01', '2024-01-05', '2024-01-10', 'confirmed'),
(2, 2, '2024-01-02', '2024-01-06', '2024-01-12', 'completed'),
(3, 3, '2024-01-03', '2024-01-07', '2024-01-14', 'confirmed'),
(4, 4, '2024-01-04', '2024-01-08', '2024-01-15', 'cancelled'),
(5, 5, '2024-01-05', '2024-01-09', '2024-01-16', 'completed');

INSERT INTO Payments (reservation_id, payment_date, amount_paid, payment_method)
VALUES
(1, '2024-01-05', 500.00, 'credit card'),
(2, '2024-01-06', 700.00, 'cash'),
(3, '2024-01-07', 800.00, 'credit card'),
(4, '2024-01-08', 300.00, 'cash'),
(5, '2024-01-09', 900.00, 'credit card');

INSERT INTO Staff (first_name, last_name, Staff_role, hire_date)
VALUES
('John', 'Doe', 'receptionist', '2023-01-01'),
('Jane', 'Doe', 'manager', '2022-01-01'),
('Jim', 'Beam', 'housekeeper', '2021-01-01'),
('Jack', 'Daniels', 'receptionist', '2020-01-01'),
('Jill', 'Stark', 'housekeeper', '2019-01-01');

SELECT * FROM Rooms WHERE stats = 'available' AND floor_number = 2;

SELECT r.reservation_id, c.first_name, c.last_name, c.email, r.check_in_date
FROM Reservations r
JOIN Customers c ON r.customer_id = c.customer_id
ORDER BY r.check_in_date;

SELECT c.first_name, c.last_name, c.email
FROM Reservations r
JOIN Customers c ON r.customer_id = c.customer_id
WHERE DATEDIFF(r.check_out_date, r.check_in_date) > 5;

SELECT reservation_id, SUM(amount_paid) AS total_paid
FROM Payments
GROUP BY reservation_id;

SELECT room_type, AVG(price_per_night) AS avg_price
FROM Rooms
GROUP BY room_type;

SELECT SUM(amount_paid) AS total_revenue
FROM Payments
WHERE payment_date >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH);

SELECT s.first_name, s.last_name, COUNT(ra.assignment_id) AS assignments_count
FROM RoomAssignments ra
JOIN Staff s ON ra.staff_id = s.staff_id
WHERE ra.assignment_date >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH)
GROUP BY s.staff_id
ORDER BY assignments_count DESC;

SELECT c.customer_id, c.first_name, c.last_name, MAX(r.reservation_date) AS recent_reservation
FROM Reservations r
JOIN Customers c ON r.customer_id = c.customer_id
GROUP BY c.customer_id;

delete Reservations, Payments 
from Reservations r
join payments p
on r.reservation_id=p.reservation_id
where r.reservation_id=1;

SELECT r.*
FROM Rooms r
LEFT JOIN Reservations res ON r.room_id = res.room_id 
AND (res.check_in_date <= '2024-12-05' AND res.check_out_date >= '2024-12-01')
WHERE r.stats = 'available'
AND res.reservation_id IS NULL;






