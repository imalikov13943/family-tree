package study_group.controller;

import study_group.study_group.StudyGroup;
import study_group.study_group.StudyGroupService;
import study_group.student.Student;
import study_group.teacher.Teacher;
import study_group.student.StudentService;
import study_group.teacher.TeacherService;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;
    private StudentService studentService;
    private TeacherService teacherService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
        this.studentService = new StudentService();
        this.teacherService = new TeacherService();
    }

    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = teacherService.getTeacherById(teacherId);
        List<Student> students = studentService.getStudentsByIds(studentIds);
        return studyGroupService.formStudyGroup(teacher, students);
    }

    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println(studyGroup);
    }
}
