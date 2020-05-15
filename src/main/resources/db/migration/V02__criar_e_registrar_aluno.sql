CREATE TABLE aluno(
   id_aluno INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
   nome VARCHAR(255) NOT NULL,
   rg VARCHAR(255),
   cpf VARCHAR(255),
   email VARCHAR(255),
   id_curso INTEGER NOT NULL,
   data_nasc DATE,
   FOREIGN KEY (id_curso) REFERENCES curso(id_curso)
   
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

  
 INSERT INTO aluno(nome,rg,cpf,email,id_curso,data_nasc) 
 values('Rafael','49.698.458-36','333.555.888-25','rafagarcia_3@hotmail.com',1,'1979-06-25');
 
  INSERT INTO aluno(nome,rg,cpf,email,id_curso,data_nasc) 
 values('Roberval','31.852.741-98','147.258.369-87','roberval@gmail.com',1,'1988-04-17');
 
 INSERT INTO aluno(nome,rg,cpf,email,id_curso,data_nasc) 
 values('Monique','27.382.369-58','852.987.456-50','moniqueIse@hotmail.com',2,'1998-06-10');
 
  INSERT INTO aluno(nome,rg,cpf,email,id_curso,data_nasc) 
 values('Isa','44.458.852-98','25.852.789-39','isa@yahoo.com',3,'1992-02-18');
