drop database if exists db_controle_estoque;
create database db_controle_estoque;

use db_controle_estoque;

drop table if exists produto;
drop table if exists cliente;

create table produto(
	id int auto_increment,
	descricao varchar(60),
    qtd float(10),
    preco float(15),
    fg_ativo boolean,
    
	PRIMARY KEY (id)
); 

create table cliente(
	id int auto_increment,
	nome varchar(60),
    telefone varchar(20),
    cpf varchar(20),
    fg_ativo boolean,
    
	PRIMARY KEY (id)
); 















