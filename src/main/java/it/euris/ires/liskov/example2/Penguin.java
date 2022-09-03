package it.euris.ires.liskov.example2;

public class Penguin extends Bird {
  @Override
  public void fly() {
    throw new RuntimeException("I'm too heavy to fly!");
  }

  @Override
  public void run() {
    super.run();
  }
}
