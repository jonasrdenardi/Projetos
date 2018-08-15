SELECT v.id as 'id_venda', c.nome, v.data_venda, v.desconto, v.valor
FROM venda as v
INNER JOIN cliente as c ON (v.id_cliente = c.id)
WHERE v.id = 2
ORDER BY v.data_venda desc