package it.euris.ires.interfacesegregation.example2;

public class RobotWorker implements Worker {
  @Override
  public void work() {
    System.out.println("Working hard!");
  }

  @Override
  public void eat() {
    throw new UnsupportedOperationException("Robots don't eat!");
  }

  @Override
  public void recharge() {
    System.out.println("Recharging the batteries!");
  }
}
