CREATE TABLE curso(
   id_curso INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
   nome VARCHAR(255) NOT NULL,
   descricao VARCHAR(255) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

   INSERT INTO curso(nome,descricao) values('Java', 'Spring Boot');
   INSERT INTO curso(nome,descricao) values('Flutter', 'Linguagem Dart e Flutter');
   INSERT INTO curso(nome,descricao) values('Html e Css', 'Html e Css');

  