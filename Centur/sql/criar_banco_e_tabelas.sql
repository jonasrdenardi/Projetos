drop database if exists db_controle_estoque;
create database db_controle_estoque;

use db_controle_estoque;

drop table if exists produto;
drop table if exists cliente;
drop table if exists venda;
drop table if exists produto_venda;
drop table if exists recebimento;

create table if not exists produto(
	id int auto_increment,
	descricao varchar(60),
    qtd float(10),
    preco_compra float(15),
    preco float(15),
    vencimento date,
    fg_ativo boolean,
    
	PRIMARY KEY (id)
); 

create table if not exists cliente(
	id int auto_increment,
	nome varchar(60),
    telefone varchar(20),
    cpf varchar(15),
    fg_ativo boolean,
    
	PRIMARY KEY (id)
); 

create table if not exists venda(
	id int auto_increment,
    id_cliente int,
	data_venda date,
    desconto float(15),
	valor float(15),
	fg_ativo boolean,
		CONSTRAINT pk_venda_id PRIMARY KEY(id),
		CONSTRAINT fk_venda_id_cliente FOREIGN KEY(id_cliente)
			REFERENCES cliente(id)
);

create table if not exists produto_venda(
	id_venda int,
	id_produto int,
	qtd_produto	float(8,2),
	preco_produto float(15),
		CONSTRAINT pk_produto_venda_id_venda_id_produto PRIMARY KEY(id_venda,id_produto),
		CONSTRAINT fk_produto_venda_id_venda FOREIGN KEY(id_venda)
			REFERENCES venda(id),
		CONSTRAINT fk_produto_venda_id_produto FOREIGN KEY(id_produto)
			REFERENCES produto(id) ON DELETE CASCADE
);


create table if not exists recebimento(
	id int auto_increment,
    id_venda int,
    num_parcela int,
    data_recebimento date,
    valor_recebido float,
    modo_pgto varchar(50),
    obs varchar(240),
	fg_ativo bool,
		CONSTRAINT pk_recebimento_id PRIMARY KEY(id),
        CONSTRAINT fk_recebimento_id_venda FOREIGN KEY(id_venda) REFERENCES venda(id)
);













