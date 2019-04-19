create database estoque;
use estoque;

create table produto(
id_produto int not null auto_increment,
nome_produto varchar(50) not null,
tipo_produto varchar(50) not null,
valor_unitario double not null,
qtd_estoque int not null
);