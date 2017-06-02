create database applicationregistry;
use application registry;

CREATE TABLE Users(
	Neptuncode VARCHAR(200) PRIMARY KEY,
	Password VARCHAR(200) NOT NULL,
	Age INT NOT NULL,
	FirstName VARCHAR(200) NOT NULL,
	LastName VARCHAR(200) NOT NULL,
	Email VARCHAR(200) NOT NULL,
	IsTeacher BOOLEAN NOT NULL,
	Enabled BOOLEAN NOT NULL
);

CREATE TABLE Templates(
	Title VARCHAR(200) PRIMARY KEY,
	Value VARCHAR(200) NOT NULL,
	Recipient VARCHAR(200) NOT NULL
);
CREATE TABLE Requests(
	ID INT PRIMARY KEY AUTO_INCREMENT,
	Date DATE NOT NULL,
	UserID VARCHAR(200) NOT NULL,
	TemplateTitle VARCHAR(200) NOT NULL,
	Verdict VARCHAR(200),
	Status VARCHAR(200) NOT NULL,
	FOREIGN KEY (UserID) REFERENCES Users(Neptuncode),
	FOREIGN KEY (TemplateTitle) REFERENCES Templates(Title)
);
