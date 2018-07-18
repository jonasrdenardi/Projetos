SELECT s.usename, a.rolconnlimit
from pg_authid a
INNER JOIN pg_shadow s ON (s.usename = a.rolname);