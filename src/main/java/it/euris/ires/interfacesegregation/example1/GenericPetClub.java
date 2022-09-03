package it.euris.ires.interfacesegregation.example1;

public class GenericPetClub implements PetClub {

  @Override
  public void greetDog(String name) {
    System.out.println("The Pet Club welcomes a new dog, " + name + "!");
  }

  @Override
  public void greetCat(String name) {
    System.out.println("The Pet Club welcomes a new cat, " + name + "!");
  }

  @Override
  public void greetBird(String name) {
    System.out.println("The Pet Club welcomes a new bird, " + name + "!");
  }

  @Override
  public void greetTurtle(String name) {
    System.out.println("The Pet Club welcomes a new turtle, " + name + "!");
  }
}
