create database rh;

use rh;
create table funcionarios (
matricula bigint (6),
nome varchar (50),
cargo varchar (30),
salario decimal (7,2),
admissao date,
demissao date,
primary key (matricula)
);

insert into funcionarios(matricula,nome,cargo,salario,admissao)
values
(123456,'Selena Gomez','Analista de Marketing',7500,'2018-03-07'),
(124782,'Ariana Grande','Desenvolvedora Jr',4500,'2019-07-09'),
(237542,'Ana Maria Braga','Recepcionista',2500,'2021-03-10'),
(325698,'Jennifer Lopes','Gerente de Projetos',10800,'2015-03-15'),
(127852,'Hebe Camargo','Designer',3700,'2020-09-11');

select * from funcionarios where salario > 2000;

select * from funcionarios where salario < 2000;

update funcionarios set nome = 'Lady Gaga' where matricula = 123456;

