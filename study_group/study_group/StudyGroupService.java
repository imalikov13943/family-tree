package study_group.study_group;

import study_group.student.Student;
import study_group.teacher.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
