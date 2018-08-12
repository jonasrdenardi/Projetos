
CREATE user 'pamela'@'localhost' IDENTIFIED BY '123456';

GRANT all ON db_controle_estoque.* to 'pamela'@'localhost';

FLUSH privileges;
