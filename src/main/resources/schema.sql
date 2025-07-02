CREATE TABLE IF NOT EXISTS jobs_app(
    id INT PRIMARY KEY ,
    description VARCHAR(200) NOT NULL,
    company_name VARCHAR(100) NOT NULL,
    years_of_experience INT
                     );