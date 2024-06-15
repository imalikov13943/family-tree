package study_group.teacher;

import java.util.ArrayList;
import java.util.List;

// Применение SRP: Этот класс отвечает только за управление преподавателями.
public class TeacherService {
    private List<Teacher> teachers;
    private int nextId;

    public TeacherService() {
        this.teachers = new ArrayList<>();
        this.nextId = 1;
    }

    // SRP: Метод создания учителя.
    public void createTeacher(String name, String subject) {
        Teacher teacher = new Teacher(nextId++, name, subject);
        teachers.add(teacher);
    }

    // SRP: способ редактирования сведений об учителе.
    public void editTeacher(int id, String newName, String newSubject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setName(newName);
                teacher.setSubject(newSubject);
                break;
            }
        }
    }

    // SRP: Метод поиска всех учителей.
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // SRP: Способ найти преподавателя по его идентификатору.
    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null; // или сгенерировать исключение, если учитель не найден.
    }
}
