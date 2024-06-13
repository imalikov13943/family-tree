package study_group.teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;
    private int nextId;

    public TeacherService() {
        this.teachers = new ArrayList<>();
        this.nextId = 1;
        teachers.add(new Teacher(nextId++, "Светлана", "Математика"));
        teachers.add(new Teacher(nextId++, "Андрей", "Физика"));
    }

    public void createTeacher(String name, String subject) {
        Teacher teacher = new Teacher(nextId++, name, subject);
        teachers.add(teacher);
    }

    public void editTeacher(int id, String newName, String newSubject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setName(newName);
                teacher.setSubject(newSubject);
                break;
            }
        }
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher getTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null; 
    }
}
