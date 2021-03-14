create database db_escola;
use db_escola;
create table tb_alumni(
matricula int not null,
nome varchar (30) not null,
curso varchar(20),
endereco varchar(50),
nascimento date,
primary key (matricula)
);

alter table tb_alumni add media decimal(4,2) after curso;
alter table tb_alumni drop endereco;
alter table tb_alumni modify curso varchar(30);
desc tb_alumni;


insert into tb_alumni 
values
(1574,'Marina Silva','Ciências da Computação',7,'1995-10-12'),
(1254,'Maria Santos','Egenharia Química',5,'1992-01-10'),
(1789,'Maicon Silva','Ciências da Computação',7.2,'1999-02-03'),
(1432,'Richard Luz','Matemática Aplicada',8.5,'1991-10-03'),
(1298,'Sérgio Filho','Estatística',5.75,'1991-12-07'),
(1665,'Roberto Sá','Engenharia Mecânica',7.75,'1989-02-13'),
(1784,'Vanessa Jesus','Arquitetura de Sistemas',7.5,'1997-10-02'),
(1552,'Rogerio Santos','ências da Computação',5.2,'1995-02-07');

select * from tb_alumni order by media;

select nome,media from tb_alumni where media> 7.0;
select matricula,media from tb_alumni where media < 7;

update tb_alumni set media = 8.75 where matricula = 1552;
select media from tb_alumni where matricula = 1552;

update tb_alumni set curso = 'Ciências da Computação' where matricula = 1552;