SELECT DISTINCT v.id as 'id_venda', c.nome, v.data_venda, v.desconto, v.valor, v.fg_ativo
FROM venda as v
INNER JOIN cliente as c ON (v.id_cliente = c.id)
INNER JOIN recebimento as r ON (v.id = r.id_venda)
where v.fg_ativo = false
AND r.fg_ativo = true
ORDER BY v.data_venda desc;