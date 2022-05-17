public class Grade {
  private int grade;
  private Course course;

  public Grade(int grade, Course course) {
    if(grade == 12 || grade == 10 || grade == 7 || grade == 4 || grade == 2 || grade == 0 || grade == -3)
      this.grade = grade;
    else
      throw new IllegalArgumentException("The grade is invalid");
    this.course = course;
  }

  public int getGrade() {
    return grade;
  }

  public Course getCourse() {
    return course;
  }

  public Grade copy() {
    return new Grade(grade,course);
  }

  @Override
  public String toString() {
    return "Grade{" +
        "grade=" + grade +
        ", course=" + course +
        '}';
  }
}
