CREATE TABLE IF NOT EXISTS Employee
(
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    telephone   VARCHAR(255) NOT NULL,
    age         INT          NOT NULL,
    dateHiring  DATE         NOT NULL,
    dateExit    DATE
);

CREATE TABLE IF NOT EXISTS Animal
(
    id                INT AUTO_INCREMENT PRIMARY KEY,
    temporaryName     VARCHAR(255) NOT NULL,
    estimatedAge      INT          NOT NULL,
    breed             VARCHAR(255) NOT NULL,
    species           VARCHAR(255) NOT NULL,
    entryDate         DATE         NOT NULL,
    adoptionDate      DATE,
    arrivalConditions VARCHAR(255) NOT NULL,
    employee_id       INT          NOT NULL,
    dateOfDeath       DATE,
    animalSize        VARCHAR(255) NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES Employee (employee_id)
);
