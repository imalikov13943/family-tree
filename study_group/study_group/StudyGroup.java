package study_group.study_group;

import study_group.student.Student;
import study_group.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup() {
        this.students = new ArrayList<>();
    }

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }

    public void sortByName() {
        students.sort(new study_group.student.comparators.StudentComparatorByName());
    }

    public void sortByAge() {
        students.sort(new study_group.student.comparators.StudentComparatorByAge());
    }
}
