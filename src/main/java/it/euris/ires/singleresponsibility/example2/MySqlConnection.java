package it.euris.ires.singleresponsibility.example2;

public class MySqlConnection {

  private String connectionString;

  public MySqlConnection(String connectionString) {
    this.connectionString = connectionString;
  }

  public String getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }
}
