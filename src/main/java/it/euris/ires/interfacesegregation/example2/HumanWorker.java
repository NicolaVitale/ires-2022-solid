package it.euris.ires.interfacesegregation.example2;

public class HumanWorker implements Worker {
  @Override
  public void work() {
    System.out.println("Working hard!");
  }

  @Override
  public void eat() {
    System.out.println("Having a snack!");
  }

  @Override
  public void recharge() {
    throw new UnsupportedOperationException("Human don't need to recharge batteries");
  }
}
