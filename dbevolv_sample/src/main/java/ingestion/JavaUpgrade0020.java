package ingestion;

import java.sql.Connection;

public class JavaUpgrade0020 {
  public void execute(Connection connection, String dbName) throws java.sql.SQLException {
    connection
    .createStatement()
    .execute("INSERT INTO kv (k, v) VALUES ('0002-java', '0002-java') ON DUPLICATE KEY UPDATE k = VALUES(k), v = VALUES(v)");
  }
}