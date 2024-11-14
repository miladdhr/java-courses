CREATE TABLE Department (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE Employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    birth_date DATE NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(id)
);


INSERT INTO Department (name) VALUES ('Programming');
INSERT INTO Department (name) VALUES ('Security');
INSERT INTO Department (name) VALUES ('Network');


INSERT INTO Employee (name, salary, birth_date, department_id) VALUES ('Milad', 150.00, '1983-05-10', 1);
INSERT INTO Employee (name, salary, birth_date, department_id) VALUES ('Reza', 90.00, '1985-03-25', 3);
INSERT INTO Employee (name, salary, birth_date, department_id) VALUES ('Mahsa', 200.00, '1996-11-14', 2);
INSERT INTO Employee (name, salary, birth_date, department_id) VALUES ('Ali', 110.00, '1999-08-02', 1);
INSERT INTO Employee (name, salary, birth_date, department_id) VALUES ('Maryam', 95.00, '2000-07-22', 2);



