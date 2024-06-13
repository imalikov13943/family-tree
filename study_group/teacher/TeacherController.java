package study_group.teacher;

import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    public void createTeacher(String name, String subject) {
        teacherService.createTeacher(name, subject);
    }

    public void editTeacher(int id, String newName, String newSubject) {
        teacherService.editTeacher(id, newName, newSubject);
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        teacherView.displayTeachers(teachers);
    }
}
