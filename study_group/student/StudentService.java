package study_group.student;

import java.util.ArrayList;
import java.util.List;

// SRP: Этот класс отвечает только за управление учащимися.
public class StudentService {
    private List<Student> students;
    private int nextId;

    public StudentService() {
        this.students = new ArrayList<>();
        this.nextId = 1;
        students.add(new Student(1, "Алиса", 20));
        students.add(new Student(2, "Петр", 21));
        students.add(new Student(3, "Владислав", 22));
    }

    // SRP: Метод создания учащегося.
    public void createStudent(String name, int age) {
        Student student = new Student(nextId++, name, age);
        students.add(student);
    }

    // SRP: Метод для извлечения всех учащихся.
    public List<Student> getStudents() {
        return students;
    }

    // SRP: Способ найти студента по его идентификатору.
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // или сгенерировать исключение, если студент не найден
    }
}
