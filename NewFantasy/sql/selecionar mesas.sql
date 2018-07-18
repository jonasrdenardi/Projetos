-- Lista mesas ativas
SELECT *
FROM tb_mesa
WHERE fg_ativo = true;

-- Lista mesas inativas
SELECT *
FROM tb_mesa
WHERE fg_ativo = false;
