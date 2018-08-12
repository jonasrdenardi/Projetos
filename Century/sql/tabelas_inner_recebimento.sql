use db_controle_estoque;

SELECT c.id as 'id_cliente', c.nome, r.id as 'id_recebimento', r.num_parcela, r.data_recebimento, r.valor_recebido, r.modo_pgto,
	   r.id_venda, v.desconto, v.data_venda, v.valor, r.obs, r.fg_ativo
FROM recebimento as r
INNER JOIN venda as v ON (r.id_venda = v.id)
INNER JOIN cliente as c ON (v.id_cliente = c.id)
order by r.data_recebimento;


















