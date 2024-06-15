package study_group.controller;

import study_group.study_group.StudyGroup;
import study_group.student.Student;
import study_group.teacher.Teacher;
import study_group.teacher.TeacherService;
import study_group.student.StudentService;

import java.util.ArrayList;
import java.util.List;

// SRP: Этот класс координирует создание учебных групп и управление ими.
public class Controller {
    private TeacherService teacherService;
    private StudentService studentService;

    // DIP: Контроллер зависит от абстракций (TeacherService and StudentService)
    public Controller() {
        this.teacherService = new TeacherService();
        this.studentService = new StudentService();
    }

    // SRP: Метод создания учебной группы.
    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = teacherService.getTeacherById(teacherId);
        List<Student> students = new ArrayList<>();

        for (int studentId : studentIds) {
            Student student = studentService.getStudentById(studentId);
            if (student != null) {
                students.add(student);
            }
        }

        return new StudyGroup(teacher, students);
    }

    // SRP: метод отображения исследовательской группы.
    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println(studyGroup);
    }
}
