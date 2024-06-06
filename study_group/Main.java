package study_group;

import study_group.stream.Stream;
import study_group.study_group.StudyGroup;
import study_group.controller.Controller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        StudyGroup group1 = new StudyGroup();
        StudyGroup group2 = new StudyGroup();
        stream1.addStudyGroup(group1);
        stream1.addStudyGroup(group2);

        Stream stream2 = new Stream();
        StudyGroup group3 = new StudyGroup();
        stream2.addStudyGroup(group3);

        Stream stream3 = new Stream();
        StudyGroup group4 = new StudyGroup();
        StudyGroup group5 = new StudyGroup();
        StudyGroup group6 = new StudyGroup();
        stream3.addStudyGroup(group4);
        stream3.addStudyGroup(group5);
        stream3.addStudyGroup(group6);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        Controller controller = new Controller();
        controller.sortStreams(streams);

        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }
    }
}
