SELECT
c.id as 'id_cliente', c.nome, v.id, v.data_venda, v.desconto, v.valor, v.fg_ativo
    
FROM
	venda as v
INNER JOIN
	cliente as c ON v.id_cliente = c.id
ORDER BY v.id;