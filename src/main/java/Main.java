public class Main {
    public String grade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid marks");
        }
        if (marks >= 90) {
            return "A";
        }
        if (marks >= 80) {
            return "B";
        }
        if (marks >= 70) {
            return "C";
        }
        if (marks >= 60) {
            return "D";
        }
        return "F";
    }
}

class StudentGrade extends Main {
}