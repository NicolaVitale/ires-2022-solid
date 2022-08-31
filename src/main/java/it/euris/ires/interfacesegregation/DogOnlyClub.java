package it.euris.ires.interfacesegregation;

public class DogOnlyClub implements PetClub {

  @Override
  public void greetDog(String name) {
    System.out.println("The Pet Club welcomes a new dog, " + name + "!");
  }

  @Override
  public void greetCat(String name) {
    System.out.println("Sorry " + name + ", this is a dog only club!");
  }

  @Override
  public void greetBird(String name) {
    System.out.println("Sorry " + name + ", this is a dog only club!");
  }

  @Override
  public void greetTurtle(String name) {
    System.out.println("Sorry " + name + ", this is a dog only club!");
  }
}
