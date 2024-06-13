package study_group.student.comparators;

import java.util.Comparator;

import study_group.student.Student;

public class StudentComparatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
