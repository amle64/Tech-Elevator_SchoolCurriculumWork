package practice;

public class Student {
    private String studentName ;
    private int id;
    private static int studentCount = 0;
    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
        studentCount++;
    }
    public static int getStudentCount() {
        return studentCount;
    }
}
