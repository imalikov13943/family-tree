package study_group.student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
        students.add(new Student(1, "Алиса", 20));
        students.add(new Student(2, "Петр", 21));
        students.add(new Student(3, "Владислав", 22));
    }

    public List<Student> getStudentsByIds(List<Integer> studentIds) {
        List<Student> selectedStudents = new ArrayList<>();
        for (Integer id : studentIds) {
            for (Student student : students) {
                if (student.getId() == id) {
                    selectedStudents.add(student);
                }
            }
        }
        return selectedStudents;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
