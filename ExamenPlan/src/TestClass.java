import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestClass {
  public static void main(String[] args) {
    Student student = new Student(315193, "Eduard-Gabriel Vlad");
    student.addCourse(new Course("SDJ"));
    student.addCourse(new Course("RWD"));
    student.addCourse(new Course("SEP1"));
    student.addCourse(new Course("DMA"));
    student.addCoronaPassport(new CoronaPassport("Vaccinated", new Date(25,12,2021)));
    System.out.println("The student has " + student.getAllCourses().length + " courses.");
    ArrayList<Resource> resources = new ArrayList<>();
    resources.add(new Resource("PresentationSDJ", "pptx"));
    resources.add(new Resource("TodaySDJ","PDF"));
    student.getAllCourses()[0].addLesson(new DiscordLesson("Variables", new Date(3,1,2022), new Time(8,20,0), new Time(12,0,0),resources.toArray(new Resource[0]),true,"SDJ"));
    student.getAllCourses()[0].addLesson(new DiscordLesson("Classes", new Date(5,1,2022), new Time(8,20,0), new Time(12,0,0),resources.toArray(new Resource[0]),true,"SDJ"));
    student.getAllCourses()[0].addLesson(new DiscordLesson("Constructors", new Date(7,1,2022), new Time(8,20,0), new Time(12,0,0),resources.toArray(new Resource[0]),true,"SDJ"));
    resources = new ArrayList<>();
    resources.add(new Resource("PresentationRWD", "pptx"));
    resources.add(new Resource("TodayRWD","PDF"));
    student.getAllCourses()[1].addLesson(new ZoomLesson("HTML", new Date(3,1,2022), new Time(12,45,0), new Time(16,0,0),resources.toArray(new Resource[0]),true,"www.zoom.com/RWD",false));
    student.getAllCourses()[1].addLesson(new ZoomLesson("BootStrap", new Date(5,1,2022), new Time(12,45,0), new Time(16,0,0),resources.toArray(new Resource[0]),true,"www.zoom.com/RWD",false));
    student.getAllCourses()[1].addLesson(new ZoomLesson("JavaScript", new Date(7,1,2022), new Time(12,45,0), new Time(16,0,0),resources.toArray(new Resource[0]),true,"www.zoom.com/RWD",false));
    resources = new ArrayList<>();
    resources.add(new Resource("PresentationSEP", "pptx"));
    resources.add(new Resource("TodaySEP1","PDF"));
    student.getAllCourses()[2].addLesson(new ZoomLesson("Projects", new Date(4,1,2022), new Time(8,20,0), new Time(12,0,0),resources.toArray(new Resource[0]),false,"www.zoom.com/SEP1",true));
    student.getAllCourses()[2].addLesson(new ZoomLesson("Documentation", new Date(6,1,2022), new Time(8,20,0), new Time(12,0,0),resources.toArray(new Resource[0]),false,"www.zoom.com/SEP1",true));
    student.getAllCourses()[2].addLesson(new ZoomLesson("Implementation", new Date(8,1,2022), new Time(8,20,0), new Time(12,0,0),resources.toArray(new Resource[0]),false,"www.zoom.com/SEP1",true));
    resources = new ArrayList<>();
    resources.add(new Resource("PresentationDMA", "pptx"));
    resources.add(new Resource("TodayDMA","PDF"));
    student.getAllCourses()[3].addLesson(new DiscordLesson("Logarithms", new Date(4,1,2022), new Time(12,45,0), new Time(16,0,0),resources.toArray(new Resource[0]),false,"DMA"));
    student.getAllCourses()[3].addLesson(new DiscordLesson("Algorithms", new Date(6,1,2022), new Time(12,45,0), new Time(16,0,0),resources.toArray(new Resource[0]),false,"DMA"));
    student.getAllCourses()[3].addLesson(new DiscordLesson("Big O", new Date(8,1,2022), new Time(12,45,0), new Time(16,0,0),resources.toArray(new Resource[0]),false,"DMA"));
    System.out.println("The lessons for: " + student.getName());
    for (int i = 0; i < student.getAllCourses().length; i++) {
      for (int j = 0; j < student.getAllCourses()[i].getAllLessons().size(); j++) {
        System.out.println(" are at "+ student.getAllCourses()[i].getName() + " about " + student.getAllCourses()[i].getAllLessons().get(j).toString());
      }
      System.out.println();
    }
    student.addGrade(new Grade(12,student.getAllCourses()[0]));
    student.addGrade(new Grade(10,student.getAllCourses()[0]));
    student.addGrade(new Grade(7,student.getAllCourses()[0]));
    student.addGrade(new Grade(12,student.getAllCourses()[1]));
    student.addGrade(new Grade(7,student.getAllCourses()[1]));
    student.addGrade(new Grade(-3,student.getAllCourses()[1]));
    student.addGrade(new Grade(12,student.getAllCourses()[2]));
    student.addGrade(new Grade(10,student.getAllCourses()[2]));
    student.addGrade(new Grade(12,student.getAllCourses()[2]));
    student.addGrade(new Grade(10,student.getAllCourses()[3]));
    student.addGrade(new Grade(7,student.getAllCourses()[3]));
    student.addGrade(new Grade(4,student.getAllCourses()[3]));
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("The grades average is: "+df.format(student.getGradeAverage()));
    System.out.println(student.getCoronaPassport());
    System.out.println(student.getAllCourses()[0].getAllLessons().get(0).getAllPDFs());
    System.out.println(student.hasValidCoronaPassport());
    System.out.println(student.getAllCourses()[0].getAllLessons().get(0).equals(student.getAllCourses()[0].getAllLessons().get(1)));
  }
}