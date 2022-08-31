package it.euris.ires.liskov;

public class CommonDuck implements Duck {
  @Override
  public void quack() {
    System.out.println("QUACK!");
  }

  @Override
  public void walk() {
    System.out.println("CommonDuck walks a bit.");
  }
}
