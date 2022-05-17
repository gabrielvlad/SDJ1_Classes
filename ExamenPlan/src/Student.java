import java.util.ArrayList;

public class Student {
  private int studentNumber;
  private String name;
  private CoronaPassport coronaPassport;
  private ArrayList<Course> courses;
  private ArrayList<Grade> grades;


  public Student(int studentNumber, String name) {
    this.studentNumber = studentNumber;
    this.name = name;
    courses = new ArrayList<>();
    grades = new ArrayList<>();
  }

  public int getStudentNumber() {
    return studentNumber;
  }

  public String getName() {
    return name;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public void addGrade(Grade grade) {
    grades.add(grade.copy());
  }

  public  void addCoronaPassport(CoronaPassport passport) {
    coronaPassport = passport;
  }

  public void removeCoronaPassport() {
    coronaPassport = null;
  }

  public CoronaPassport getCoronaPassport() {
    return coronaPassport;
  }

  public boolean hasValidCoronaPassport() {
    if(coronaPassport.getReason().equalsIgnoreCase("Vaccinated"))
      return true;
    else if(coronaPassport.getReason().equalsIgnoreCase("Tested") && coronaPassport.getDate().numberOfDaysUntil(coronaPassport.getDate().today()) <= 3)
      return true;
    else if(coronaPassport.getReason().equalsIgnoreCase("Infected") && coronaPassport.getDate().numberOfDaysUntil(coronaPassport.getDate().today()) >14 && coronaPassport.getDate().numberOfDaysUntil(coronaPassport.getDate().today()) < 180)
      return true;
    return false;
  }

  public double getGradeAverage() {
    double avg = 0;
    for (int i = 0; i < grades.size(); i++) {
      avg+=grades.get(i).getGrade();
    }
    return avg/grades.size();
  }

  public Grade[] getAllGrades() {
    return grades.toArray(new Grade[0]);
  }

  public Course[] getAllCourses() {
    return courses.toArray(new Course[0]);
  }
}
