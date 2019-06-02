--CREATE DATABASE db_disciplinas 
CREATE TABLE disciplinas
(	
	id INT IDENTITY NOT NULL PRIMARY KEY,
	nome VARCHAR(50),
	cargaHoraria INT,
	areaConhecimento VARCHAR(30),
	numeroVagas INT,
	periodo VARCHAR (30)
)

