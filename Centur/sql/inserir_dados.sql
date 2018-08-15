insert into db_controle_estoque.produto(descricao,qtd,preco,vencimento,fg_ativo)
values
('colonia 1',13,50.50,'2018-01-31',true),
('sabonete 1',08,3.25,'2016-06-15',true),
('colonia 2',10,85.54,'2015-02-10',false);

insert into db_controle_estoque.cliente(nome,telefone,cpf,fg_ativo)
values
('Jonas','564564','2556489',true),
('Ricardo','2558791','2156489',true);


insert into db_controle_estoque.venda(id_cliente,data_venda,desconto,valor,fg_ativo)
values
(1,'2018-02-05',10.20,50.30,true),
(1,'2018-02-08',15.35,80.29,true);


insert into db_controle_estoque.produto_venda(id_venda,id_produto,qtd_produto,preco_produto)
values
(1,1,2,50.50),
(1,2,2,3.25);
