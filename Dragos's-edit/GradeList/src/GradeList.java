import java.util.Arrays;

public class GradeList {
    private int actualNumberOfGrades;
    private Grade[] grades;

    public GradeList(int maxNumberOfGrades) {
        grades = new Grade[maxNumberOfGrades];
        actualNumberOfGrades = 0;
    }

    public int size() {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != null)
                actualNumberOfGrades++;
        }
        return actualNumberOfGrades;
    }

    public void addGrade(Grade grade) {
        if (grade.isLegalGrade(grade.getGrade())) {
            int i = 0;
            while (grades[i] != null)
                i++;
            grades[i] = grade;
        } else {
            System.out.println("Illegal grade");
        }
    }

    public void addGrade(int i, Grade grade) {
        if (grade.isLegalGrade(grade.getGrade())) {
            if (i > grades.length || i < 0)
                System.out.println("Illegal grade");
            else {
                if (grades[i] != null)
                    System.out.println("There is a grade already at that position");
                else
                    grades[i] = grade;
            }
        } else {
            System.out.println("Illegal grade!");
        }
    }

    public void removeGrade(int i) {
        grades[i] = null;
    }

    public Grade getGrade(int i) {
        return grades[i];
    }

    public Grade getMaxGrade() {
        Grade maxi = new Grade(-3);
        for (int i = 0; i < grades.length; i++) {
            if (maxi.getGrade() < grades[i].getGrade())
                maxi.setGrade(grades[i].getGrade());
        }
        return maxi;
    }

    public Grade getMinGrade() {
        Grade mini = new Grade(12);
        for (int i = 0; i < grades.length; i++) {
            if (mini.getGrade() < grades[i].getGrade())
                mini.setGrade(grades[i].getGrade());
        }
        return mini;
    }

    public double getAverage() {
        double sum = 0;
        size();
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != null) {
                sum += grades[i].getGrade();
            }
        }
        return sum / actualNumberOfGrades;
    }

    public int getGradeCount(Grade grade) {
        int number = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].equals(grade))
                number++;
        }
        return number;
    }


    public String getGradeDistribution() {
        return "12 ("+getGradeCount(new Grade(12))+"), "+"10 ("+getGradeCount(new Grade(10))+"), "+"7 ("+getGradeCount(new Grade(7))+"), "+"4 ("+getGradeCount(new Grade(4))+"), "+"0 ("+getGradeCount(new Grade(0))+"), "+"-3 ("+getGradeCount(new Grade(-3))+")";
    }

    @Override
    public String toString() {
        return "actualNumberOfGrades=" + actualNumberOfGrades + ", grades=" + Arrays.toString(grades);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GradeList)) {
            return false;
        } else {
            GradeList other = (GradeList) obj;
            return other.actualNumberOfGrades == actualNumberOfGrades && other.grades.equals(grades);
        }
    }
}
