package study_group;

import study_group.controller.Controller;
import study_group.study_group.StudyGroup;
import study_group.teacher.TeacherController;

import java.util.Arrays;

// Основной класс для тестирования полной функциональности.
public class Main {
    public static void main(String[] args) {
        // TeacherController для управления преподавателями
        TeacherController teacherController = new TeacherController();

        //Создаем учителей
        teacherController.createTeacher("Светлана", "Математика");
        teacherController.createTeacher("Андрей", "Физика");

        // Показ учителей
        System.out.println("Учителя после создания:");
        teacherController.displayTeachers();

        // Редактируем учителей
        teacherController.editTeacher(1, "Светлана Петровна", "Математический анализ");

        // Отображение учителей после редактирования
        System.out.println("Учителя после редактирования:");
        teacherController.displayTeachers();

        // Определите идентификаторы преподавателя и студента для создания учебной группы
        int teacherId = 1;
        var studentIds = Arrays.asList(1, 2);

        // Контроллер для потоков
        Controller controller = new Controller();

        // Создаем и отображаем учебную группу
        StudyGroup studyGroup = controller.createStudyGroup(teacherId, studentIds);
        controller.displayStudyGroup(studyGroup);
    }
}
