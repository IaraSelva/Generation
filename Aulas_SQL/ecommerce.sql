create database db_ecommerce;

use db_ecommerce;
create table produtos (
id int auto_increment,
nome varchar(30),
marca varchar(20),
preco decimal(7,2),
disponivel boolean
);

alter table produtos add cor varchar(10) after nome;

insert into produtos (nome, cor, marca, preco)
values
('camisa','azul','Lacoste',78.9),
('calça','preta','Gucci',390.99),
('paletó','branco','Garbo',750),
('camiseta','branca','Oakley',89.9),
('tênis','verde','Nike',890);

update produtos set nome = 'Camisa' where id = 1;
update produtos set nome = 'Calça' where id = 2;
update produtos set nome = 'Paletó' where id = 3;
update produtos set nome = 'Camiseta' where id = 4;
update produtos set nome = 'Tênis' where id = 5;

alter table produtos rename tb_produtos;

select * from tb_produtos
order by preco;

select nome, preco from tb_produtos where preco > 500 order by preco desc;
select marca, preco from tb_produtos where preco < 500 order by preco;

update tb_produtos set preco = 50 where preco = 89.90
limit 1;

insert into tb_produtos (nome, cor, marca, preco)
values
('Tênis','preto','Nike',798.9),
('Camisa Pólo','amarela','Lacoste',89.90),
('Meia','cinza','',9.90);
select * from tb_produtos where marca like '%la%' order by preco;

desc tb_produtos;
alter table tb_produtos modify disponivel boolean default true;

select * from tb_produtos;