SHOW DATABASES;

create database medicaldb;
USE medicaldb;

CREATE TABLE patient(
	id int PRIMARY KEY AUTO_INCREMENT,
    firstName varchar(50),
    lastName varchar(100),
    age varchar(100),
    phoneNumber varchar(100),
    email varchar(100),
    gender varchar(100),
    patientType varchar(50)
    );

DROP TABLE patient;

INSERT INTO patient(firstName, lastName, age, phoneNumber, email, gender, patientType)
	VALUES('Jincheng', 'Jiang', '24', '134234', 'aejofa@faij', 'MALE', 'Appointment');
SELECT * FROM patient;
