-- Create tables

CREATE TABLE Courses (
  code VARCHAR(9) NOT NULL,
  lecture VARCHAR(50) NOT NULL,
  professor VARCHAR(10) NOT NULL,
  location VARCHAR(10) NOT NULL,
  start_time int(2) NOT NULL,
  end_time int(2) NOT NULL,
  dayofweek VARCHAR(10) NOT NULL,
  description VARCHAR(200),
  PRIMARY KEY (code)
) DEFAULT CHARSET=utf8mb4;

CREATE TABLE MyCourse (
	c_num int(100) NOT NULL AUTO_INCREMENT,
	code VARCHAR(9) NOT NULL,
	dayofweek VARCHAR(2) NOT NULL,
	start_time int(2) NOT NULL,
	end_time int(2) NOT NULL, 
	PRIMARY KEY (c_num),
	FOREIGN KEY (code) REFERENCES Courses (code)
) DEFAULT CHARSET=utf8mb4;

CREATE TABLE Memo (
    m_num int(100) NOT NULL AUTO_INCREMENT,
    c_num int(100) NOT NULL,
    title VARCHAR(20) NOT NULL,
    content VARCHAR(100) NOT NULL,
    PRIMARY KEY (m_num),
    FOREIGN KEY courses(c_num) REFERENCES MyCourse (c_num)
) DEFAULT CHARSET=utf8mb4;