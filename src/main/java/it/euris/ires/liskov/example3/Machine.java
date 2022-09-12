package it.euris.ires.liskov.example3;

public abstract class Machine {
  public void prepareDrink() {
    System.out.println("prepared.");
  }

  public abstract void addMilk();
}
