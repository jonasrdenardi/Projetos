use db_controle_estoque;

SELECT r.id as 'id_recebimento',r.id_venda, r.num_parcela, c.nome, v.data_venda, r.data_recebimento, r.valor_recebido, r.modo_pgto, if(r.fg_ativo = true,'Sim','Não') as 'Recebido?',c.id as 'id_cliente'

FROM recebimento as r
INNER JOIN venda as v ON (r.id_venda = v.id)
INNER JOIN cliente as c ON (v.id_cliente = c.id)



ORDER BY r.id desc;