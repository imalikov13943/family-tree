package study_group.teacher;

import java.util.List;

// SRP: Этот класс управляет потоком управления для действий, связанных с учителем.
public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    // DIP: Контроллер зависит от абстракций (TeacherService and TeacherView)
    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    // SRP: Метод создания учителя.
    public void createTeacher(String name, String subject) {
        teacherService.createTeacher(name, subject);
    }

    // SRP: Метод редактирования преподавателя.
    public void editTeacher(int id, String newName, String newSubject) {
        teacherService.editTeacher(id, newName, newSubject);
    }

    //SRP: Метод отображения учителей.
    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        teacherView.displayTeachers(teachers);
    }
}
