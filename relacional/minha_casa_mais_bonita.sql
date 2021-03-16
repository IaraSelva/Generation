CREATE DATABASE db_minha_casa_mais_bonita;
USE db_minha_casa_mais_bonita;

CREATE TABLE tb_categoria(
id INT auto_increment,
secao ENUM ("Jardinagem","Cozinha","Paredes","Sala"),
primary key(id)
);

CREATE TABLE tb_produto(
id int auto_increment,
id_produto INT,
nome varchar(30),
descricao varchar(250), 
preco decimal(6,2),
primary key(id),
foreign key(id_produto) references tb_categoria(id)
);

CREATE TABLE tb_ususario(
cpf varchar(20) unique,
nome varchar(30)
);

alter TABLE tb_ususario rename tb_usuario;

insert into tb_usuario
values
("405.987.226-58","Rosemara Abuquerque"),
("408.227.226-56","José Alencar"),
("407.228.276-08","Rosa Santos Silva"),
("405.227.226-58","Arthur Guimarães"),
("405.987.226-58","Ricardo Cruz");

select * from tb_usuario;

insert into tb_produto (nome,preco)
values
('Abajur',222.75),
('Lâmpada',75.90),
('Quadro',587.99),
('Persiana',750),
('Vaso',650),
('Lustre',1500);

select * from tb_produto;
select * from tb_categoria;

insert into tb_categoria(secao)
values
('Jardinagem'),
('Cozinha'),
('Paredes'),
('Sala');

update tb_produto set id_produto = 4 where id = 1;
update tb_produto set id_produto = 4 where id = 2;
update tb_produto set id_produto = 3 where id = 3;
update tb_produto set id_produto = 3 where id = 4;
update tb_produto set id_produto = 1 where id = 5;
update tb_produto set id_produto = 2 where id = 6;

select nome, preco from tb_produto where preco > 50;
select nome, preco from tb_produto where preco between 3 and 60;
select nome from tb_usuario where nome like "%c%";
select nome from tb_produto where nome like "%b%";


select tb_categoria.secao, tb_produto.nome, tb_produto.preco from tb_categoria join tb_produto
on tb_categoria.id = tb_produto.id_produto where secao = 'Paredes';

select sum(preco) from tb_produto;
select avg(preco) from tb_produto;
select count(*) from tb_produto;


