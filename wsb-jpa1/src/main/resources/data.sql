INSERT INTO address (city, address_line1, address_line2, postal_code)
VALUES
    ('Boston', '456 Elm St', 'Suite 5', '62-030'),
    ('Seattle', '789 Pine St', 'Apt 12', '98101'),
    ('Denver', '101 Maple Ave', 'Floor 3', '80203'),
    ('Austin', '202 Oak Dr', 'Unit 8', '73301'),
    ('Chicago', '303 Cedar Ln', 'Bldg 2', '60605');

INSERT INTO doctor (first_Name, last_Name, telephone_Number, email, doctor_Number, specialization, address_id)
VALUES
    ('John', 'Doe', '123456789', 'john.doe@example.com', 'DOC123', 'SURGEON', 1),
    ('Jane', 'Smith', '987654321', 'jane.smith@example.com', 'DOC456', 'GP', 2),
    ('Michael', 'Johnson', '555888777', 'michael.johnson@example.com', 'DOC789', 'GP', 3),
    ('Emily', 'Brown', '222333444', 'emily.brown@example.com', 'DOC101', 'GP', 4),
    ('David', 'Wilson', '999111222', 'david.wilson@example.com', 'DOC112', 'GP', 5);

INSERT INTO patient (first_Name, last_Name, telephone_Number, email, patient_Number, date_Of_Birth, address_id, sex)
VALUES
    ('Alice', 'Johnson', '111222333', 'alice.johnson@example.com', 'PAT001', '1990-05-15', 1, 'FEMALE'),
    ('Bob', 'Smith', '444555666', 'bob.smith@example.com', 'PAT002', '1985-10-20', 2, 'MALE'),
    ('Carol', 'Williams', '777888999', 'carol.williams@example.com', 'PAT003', '1988-03-25', 3, 'OTHER'),
    ('David', 'Brown', '123456789', 'david.brown@example.com', 'PAT004', '1995-08-12', 4, 'MALE'),
    ('Emma', 'Jones', '987654321', 'emma.jones@example.com', 'PAT005', '1992-12-30', 5, 'FEMALE');

INSERT INTO visit (description, time, doctor_id, patient_id)
VALUES
    ('Regular check-up', '2024-05-10 10:00:00', 1, 1),
    ('Flu symptoms', '2024-05-12 14:30:00', 2, 2),
    ('Cardiac consultation', '2024-05-15 09:45:00', 3, 3),
    ('Dermatological examination', '2024-05-18 11:15:00', 4, 4),
    ('Neurological assessment', '2024-05-20 16:00:00', 5, 5);

INSERT INTO medical_treatment (description, type, visit_id)
VALUES
    ('Prescribed antibiotics', 'USG', 1),
    ('Physical therapy recommended', 'USG', 2),
    ('Scheduled for surgery', 'USG', 3),
    ('Topical cream prescribed', 'USG', 4),
    ('MRI scan ordered', 'USG', 5);