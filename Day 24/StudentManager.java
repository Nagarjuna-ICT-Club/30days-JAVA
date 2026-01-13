import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        if(students.isEmpty()) System.out.println("No students found!");
        else students.forEach(Student::displayInfo);
    }
}
