use db_controle_estoque;
SELECT
c.id as 'id_cliente', c.nome, v.id as 'id_venda', v.data_venda, v.desconto, v.valor, v.fg_ativo

FROM
	venda as v
INNER JOIN
	cliente as c ON c.id = v.id_cliente
WHERE v.data_venda BETWEEN '2018-07-09' AND '2018-07-09'
ORDER BY c.nome;