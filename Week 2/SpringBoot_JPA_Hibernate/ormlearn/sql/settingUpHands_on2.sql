--  2 hands on JPA data

USE ormlearn;

-- Department table related
CREATE TABLE department (
    dp_id INT AUTO_INCREMENT PRIMARY KEY,
    dp_name VARCHAR(50) NOT NULL
);

INSERT INTO department(dp_name)
VALUES
('Human Resources'),
('Development'),
('Testing');


-- Employee table related
CREATE TABLE employee (
    em_id INT AUTO_INCREMENT PRIMARY KEY,
    em_name VARCHAR(50),
    em_salary DOUBLE,
    em_permanent BOOLEAN,
    em_date_of_birth DATE,
    em_dp_id INT,
    FOREIGN KEY (em_dp_id)
        REFERENCES department(dp_id)
);

INSERT INTO employee
(em_name, em_salary, em_permanent, em_date_of_birth, em_dp_id)
VALUES
('Rahul',65000,true,'1999-04-12',2),
('Priya',70000,true,'1998-06-22',2),
('Amit',50000,false,'2000-01-15',1),
('Neha',55000,true,'1997-11-18',3);



-- Skill table and related
CREATE TABLE skill (
    sk_id INT AUTO_INCREMENT PRIMARY KEY,
    sk_name VARCHAR(50)
);

INSERT INTO skill(sk_name)
VALUES
('Java'),
('Spring Boot'),
('SQL'),
('React');


-- Employee Skill 
CREATE TABLE employee_skill (
    es_em_id INT,
    es_sk_id INT,
    PRIMARY KEY(es_em_id, es_sk_id),
    FOREIGN KEY(es_em_id)
        REFERENCES employee(em_id),
    FOREIGN KEY(es_sk_id)
        REFERENCES skill(sk_id)
);


INSERT INTO employee_skill
VALUES
(1,1),
(1,2),
(1,3),
(2,1),
(2,3),
(3,3),
(4,4);



-- verify all table
select * from department;
select * from employee;
select * from skill;
select * from employee_skill; 

