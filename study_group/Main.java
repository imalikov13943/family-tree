package study_group;

import study_group.controller.Controller;
import study_group.study_group.StudyGroup;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        int teacherId = 1;
        var studentIds = Arrays.asList(1, 2);

        StudyGroup studyGroup = controller.createStudyGroup(teacherId, studentIds);
        controller.displayStudyGroup(studyGroup);
    }
}
