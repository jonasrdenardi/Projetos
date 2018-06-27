CREATE TABLE tb_item(
id_item 	SERIAL,
desc_item 	VARCHAR NOT NULL UNIQUE,
valor_item 	NUMERIC(7,2),
fg_ativo 	BOOLEAN,
	CONSTRAINT pk_tb_item_id_item PRIMARY KEY(id_item)
);

CREATE TABLE tb_mesa(
id_mesa 	INTEGER,
fg_ativo 	BOOLEAN,
	CONSTRAINT pk_tb_mesa_id_mesa PRIMARY KEY(id_mesa)
);

CREATE TABLE tb_pedido(
id_pedido 	SERIAL,
id_mesa 	INTEGER,
dt_pedido 	TIMESTAMP,
valor_pedido 	NUMERIC(7,2),
usuario		VARCHAR(20) NOT NULL,
fg_ativo 	BOOLEAN DEFAULT TRUE,
	CONSTRAINT pk_tb_pedido_id_pedido PRIMARY KEY(id_pedido),
	CONSTRAINT fk_tb_pedido_id_mesa FOREIGN KEY(id_mesa)
		REFERENCES tb_mesa(id_mesa)
);

CREATE TABLE tb_item_pedido(
id_pedido	INTEGER,
id_item		INTEGER,
qtd_item	INTEGER,
valor_item 	NUMERIC(7,2),
valor_garcom 	NUMERIC(7,2),
	CONSTRAINT pk_item_tb_pedido PRIMARY KEY(id_item,id_pedido),
	CONSTRAINT fk_tb_item_pedido_id_item FOREIGN KEY(id_item)
		REFERENCES tb_item(id_item),
	CONSTRAINT fk_tb_item_pedido_id_pedido FOREIGN KEY(id_pedido)
		REFERENCES tb_pedido(id_pedido)
);