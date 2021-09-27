public class GradeListTest {
    public static void main(String[] args) {
        GradeList list = new GradeList(10);
        Grade grade = new Grade(12);
        list.addGrade(grade);
        list.addGrade(new Grade(-3));
        list.addGrade(new Grade(7));
        list.addGrade(new Grade(4));
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(10));
        list.addGrade(new Grade(0));
        list.addGrade(new Grade(0));
        list.addGrade(new Grade(4));
        list.addGrade(new Grade(7));
        System.out.println("Grades: " + list);
        System.out.println("Average: " + list.getAverage());
        System.out.println("Grade 12 count: " + list.getGradeCount(list.getGrade(0)));
        System.out.println("Distribution: " + list.getGradeDistribution());
    }
}
