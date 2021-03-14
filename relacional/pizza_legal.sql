create database db_pizzaria_legal;
use db_pizzaria_legal;
create table tb_categoria(
id int auto_increment not null,
tipo varchar (20),
primary key(id)
);

desc tb_categoria;

insert into tb_categoria (tipo)
values
('Vegetariana'),
('Vegana'),
('Borda Recheada'),
('Doces');

select * from tb_categoria;
update tb_categoria set tipo = 'Doce' where id = 4;

create table tb_produtos(
categoria int,
sabor varchar (20),
descricao varchar (50),
preco decimal (5,2),
foreign key(categoria) references tb_categoria(id)
);

desc tb_produtos;
ALTER TABLE tb_produtos modify descricao varchar (100);

insert into tb_produtos
values
('1','Quatro Queijos','Queijo Prato, Mussarela, Cheddar e Parmesão','47.5'),
('2','Quatro Queijos Veg','Queijo vegano de Castanhas sabor Prato, Mussarela, Cheddar e Parmesão','65.5'),
('2','Shimeji','Queijo vegano de castanhas sabor Mussarela, shimeji com cebola caramelizada','57.5'),
('2','Mix de Cogumelos','Cogumelos Paris, Shitake e Shimeji com cebola carameizada','57.5'),
('1','Marguerita','Queijo Mussarela, Tomate e Manjerião','40.5'),
('2','Marguerita Veg','Queijo Chevre Vegano, Tomate e Manjericão','52.5'),
('2','Brigadeiro','Chocolate Suísso 70% e Granulado','52.5');

select * from tb_produtos;
update tb_produtos set categoria = '4' where sabor = 'Brigadeiro'
limit 1;

select sabor, preco from tb_produtos where preco > 45;
select sabor, preco from tb_produtos where preco between 29 and 60;
select sabor from tb_produtos where sabor like '%c%';


select tb_categoria.tipo, tb_produtos.sabor from tb_categoria join tb_produtos
on id = categoria where tipo like '%veg%';


