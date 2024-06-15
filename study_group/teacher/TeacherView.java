package study_group.teacher;

import java.util.List;

// SRP: Этот класс обрабатывает логику презентации для учителей.
public class TeacherView {
    public void displayTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
