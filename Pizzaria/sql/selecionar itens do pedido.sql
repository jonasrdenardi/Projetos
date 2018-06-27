--Selecionar Itens do Pedido
SELECT p.id_pedido, i.id_item, i.desc_item, ip.qtd_item, ip.valor_item AS "Valor Unitário", (ip.qtd_item * ip.valor_item) AS "Valor Total"
FROM tb_pedido p
INNER JOIN tb_item_pedido ip ON (p.id_pedido = ip.id_pedido)
INNER JOIN tb_item i ON (ip.id_item = i.id_item);

-- Mostrar total do Pedido
SELECT p.id_pedido,SUM(ip.qtd_item * ip.valor_item) AS "Valor Total"
FROM tb_pedido p
INNER JOIN tb_item_pedido ip ON (p.id_pedido = ip.id_pedido)
INNER JOIN tb_item i ON (ip.id_item = i.id_item)
WHERE p.id_pedido = 1
GROUP BY p.id_pedido;