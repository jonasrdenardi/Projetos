use db_controle_estoque;
SELECT c.id as 'id_cliente',c.nome,pv.id_produto, p.descricao, pv.qtd_produto, pv.preco_produto,v.desconto, v.data_venda, v.valor
FROM produto_venda as pv
INNER JOIN produto as p ON (pv.id_produto = p.id)
INNER JOIN venda as v ON (pv.id_venda = v.id)
INNER JOIN cliente as c ON (v.id_cliente = c.id)
WHERE pv.id_venda = 2;

select *
from produto_venda

