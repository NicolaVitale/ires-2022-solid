package it.euris.ires.liskov.example3;

public class TeaMachine extends Machine {

  public void addMilk() {
    throw new UnsupportedOperationException("NO!");
  }
}
