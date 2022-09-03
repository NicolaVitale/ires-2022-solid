package it.euris.ires.dependencyinversion.example2;

public class Application {

  private OracleDatabase oracleDatabase;
  private MySqlDatabase mySqlDatabase;

  public Application(OracleDatabase oracleDatabase) {
    this.oracleDatabase = oracleDatabase;
  }

  public Application(MySqlDatabase mySqlDatabase) {
    this.mySqlDatabase = mySqlDatabase;
  }

  public void insertData() {
    if (oracleDatabase != null) {
      System.out.println("Inserting data in Oracle Database " + oracleDatabase.getDbName());
    } else if (mySqlDatabase != null) {
      System.out.println("Inserting data in MySQL Database " + mySqlDatabase.getDbName());
    } else {
      throw new IllegalStateException("At least one database must be not null!");
    }
  }
}
