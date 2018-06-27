/* Processed by ecpg (4.9.0) */
/* These include files are added by the preprocessor */
#include <ecpglib.h>
#include <ecpgerrno.h>
#include <sqlca.h>
/* End of automatic include section */

#line 1 "C:\\Users\\Jonas\\Desktop\\Projetos\\Pizzaria\\sql\\inserir itens na tabela.sql"
﻿-- Inserir itens
INSERT INTO tb_item(desc_item,valor_item,fg_ativo)
VALUES
('Coca Cola 600 2 l',5.30,true),
('Rodizio',30,true),
('Pizza Portuguesa pequena',25.00,true),
('Pizza Portuguesa media',30.00,true),
('Pizza Portuguesa grande',35,true),
('Pizza Quatro Queijos pequena',23.50,true),
('Pizza Quatro Queijos media',28.70,true),
('Pizza Quatro Queijos grande',33.50,false);

-- Inserir mesas
INSERT INTO tb_mesa
VALUES
(1,true),
(2,true),
(3,true),
(4,false);

-- Inserir Pedidos
INSERT INTO tb_pedido(id_mesa,dt_pedido,valor_pedido,fg_ativo,usuario,valor_garcom)
VALUES
(1,'2017-01-10',63.80,true,'postgres',6.38),
(2,'2017-01-10',96.70,true,'postgres',9.67);

-- Inserir Itens no pedido
INSERT INTO tb_item_pedido
VALUES
(1,1,1,5.30),
(1,5,1,35.00),
(1,6,1,23.50),
(2,1,2,5.30),
(2,7,3,28.70);


select *
from tb_item

SELECT *
FROM tb_item_pedido