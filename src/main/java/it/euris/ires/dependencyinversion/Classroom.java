package it.euris.ires.dependencyinversion;

import java.util.List;

public class Classroom {

  private List<Student> students;
  private Teacher teacher;

  public void whoIsInside() {

    students.forEach(
        student -> {
          System.out.println(student.getNameTag());
        });

    System.out.println(teacher.getNameTag());
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }
}
