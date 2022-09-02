package it.euris.ires.openclosed.example2;

public class Individual {
  private final Gender gender;
  private final double salary;
  private final int age;
  private final String name;

  public Individual(double salary, int age, String name, Gender gender) {
    this.gender = gender;
    this.salary = salary;
    this.age = age;
    this.name = name;
  }

  public Gender getGender() {
    return gender;
  }

  public double getSalary() {
    return salary;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
