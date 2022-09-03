package it.euris.ires.dependencyinversion.example2;

public class OracleDatabase {

  private String dbName;

  public void connect() {
    System.out.println("Connected to Oracle DB " + dbName);
  }

  public String getDbName() {
    return dbName;
  }
}
