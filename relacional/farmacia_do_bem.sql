create database db_farmacia_do_bem;
use db_farmacia_do_bem;
create table tb_categoria (
id int auto_increment,
seção varchar (30),
primary key (id)
);

create table tb_produto (
id_produto int not null,
nome varchar (30),
preco decimal (5,2),
foreign key (id_produto) references tb_categoria(id)
);

insert into tb_categoria(seção)
values
('Antibiótico'),
('Anti-inflamatório'),
('Analgésico'),
('Anticoncepcional'),
('Anti Alérgico'),
('Curativos'),
('Cosméticos');

select * from tb_categoria;

insert into tb_produto
values
(1,'Amoxicilina',15.50),
(2,'Ibuprofeno',12.49),
(3,'Dorflex',17.90),
(4,'Preservativo',8.9),
(5,'Prednisona',21.43),
(6,'Band-Aid',6.69),
(7,'Desodorante AXE',13.90),
(2,'Diclofenaco',13.50),
(2,'Cataflan',13.82),
(1,'Cefalexina',17.50),
(1,'Tetraciclina',18.89),
(3,'Dipirona',9.99),
(3,'Paracetamol',11.80),
(5,'Polaramine',19.50),
(5,'Loratadina',27.80),
(6,'Gaze',6.65);

select * from tb_produto;

select nome, preco from tb_produto
where preco < 50;

select nome from tb_produto
where preco between 10 and 15;

select * from tb_produto
where nome like '%b%';

select tb_produto.nome, tb_produto.preco, tb_categoria.seção from tb_produto join tb_categoria
on id_produto = id where preco < 10;