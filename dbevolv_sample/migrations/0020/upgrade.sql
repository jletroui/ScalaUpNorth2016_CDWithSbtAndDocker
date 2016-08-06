@@ingestion.ScalaUpgrade0020;

INSERT INTO kv (k, v)
VALUES ('0002-sql', '0002-sql')
ON DUPLICATE KEY UPDATE
  k = VALUES(k),
  v = VALUES(v);

@@ingestion.JavaUpgrade0020;
