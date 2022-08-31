package it.euris.ires.liskov;

public class RoboDuck implements Duck {

  private boolean charged;

  @Override
  public void quack() {
    if (charged) {
      System.out.println("Q-U-A-C-K-!");
      setCharged(false);
    }
  }

  @Override
  public void walk() {
    if (charged) {
      System.out.println("Robot duck walks a bit");
      setCharged(false);
    }
  }

  public boolean isCharged() {
    return charged;
  }

  public void setCharged(boolean charged) {
    this.charged = charged;
  }
}
