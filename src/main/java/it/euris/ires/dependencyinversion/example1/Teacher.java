package it.euris.ires.dependencyinversion.example1;

public class Teacher {

  private String lastName;

  public String getNameTag() {
    return "Dr. " + lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
