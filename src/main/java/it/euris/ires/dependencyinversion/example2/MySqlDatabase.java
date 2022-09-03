package it.euris.ires.dependencyinversion.example2;

public class MySqlDatabase {

  private String dbName;

  public void connect() {
    System.out.println("Connected to MySQL DB " + dbName);
  }

  public String getDbName() {
    return dbName;
  }
}
