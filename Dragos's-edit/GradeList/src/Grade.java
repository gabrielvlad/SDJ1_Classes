public class Grade {
    private int grade;
    public int[] LEGAL_GRADES = {12,10,7,4,2,0,-3};

    public Grade(int grade) {
        setGrade(grade);
    }

    public Grade(String ectsGrade) {
        switch (ectsGrade) {
            case "F" -> grade = -3;
            case "Fx" -> grade = 0;
            case "E" -> grade = 2;
            case "D" -> grade = 4;
            case "C"-> grade = 7;
            case "B" -> grade = 10;
            case "A" -> grade = 12;
            default -> {
                ectsGrade = "F";
                grade = -3;
            }
        }
    }

    public void setGrade(int grade) {
        getEctsGrade();
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getEctsGrade() {
        String ects;
        switch (grade) {
            case -3 -> ects = "F";
            case 0 -> ects = "Fx";
            case 2 -> ects = "E";
            case 4 -> ects = "D";
            case 7 -> ects = "C";
            case 10 -> ects = "B";
            case 12 -> ects = "A";
            default -> {
                ects = "F";
                grade = -3;
            }
        }
        return ects;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                '}';
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Grade))
        {
            return false;
        }
        else{
            Grade other = (Grade)obj;
            return other.grade==grade;
        }
    }

    public boolean isLegalGrade(int grade){
        for(int i=0;i< LEGAL_GRADES.length;i++)
        {
            if(grade == LEGAL_GRADES[i])
                return true;
        }
        return false;
    }

}
