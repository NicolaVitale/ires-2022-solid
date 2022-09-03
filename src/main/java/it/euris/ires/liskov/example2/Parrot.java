package it.euris.ires.liskov.example2;

public class Parrot extends Bird {

  @Override
  public void fly() {
    super.fly();
  }

  @Override
  public void run() {
    super.run();
  }

  public void talk() {
    System.out.println("Polly wants a cracker!");
  }
}
