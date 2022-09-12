package it.euris.ires.liskov.example3;

public class LSProblem {

  public static void main(String[] args) {
    Machine coffee = new CoffeeMachine();
    Machine tea = new TeaMachine();

    callDrinkMachine(coffee);
    callDrinkMachine(tea);
  }

  public static void callDrinkMachine(Machine machine) {
    machine.prepareDrink();
    machine.addMilk();
  }
}
