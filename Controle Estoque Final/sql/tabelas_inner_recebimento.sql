use db_controle_estoque;

SELECT c.id as 'id_cliente', c.nome, vr.id_recebimento, vr.id_venda, r.id, r.num_parcela, r.data_recebimento, r.valor_recebido, r.obs, r.modo,
	   v.desconto, v.data_venda, v.valor
FROM venda_recebimento as vr
INNER JOIN recebimento as r ON (vr.id_recebimento = r.id)
INNER JOIN venda as v ON (vr.id_venda = v.id)
INNER JOIN cliente as c ON (v.id_cliente = c.id)
WHERE vr.id_venda = 2;















