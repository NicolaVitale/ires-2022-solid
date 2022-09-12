package it.euris.ires.dao_dto;

public class Car {

  private String targa;
  private String modello;
  private int cilindrata;

  public String getTarga() {
    return targa;
  }

  public void setTarga(String targa) {
    this.targa = targa;
  }

  public String getModello() {
    return modello;
  }

  public void setModello(String modello) {
    this.modello = modello;
  }

  public int getCilindrata() {
    return cilindrata;
  }

  public void setCilindrata(int cilindrata) {
    this.cilindrata = cilindrata;
  }
}
