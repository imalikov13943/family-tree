package study_group.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import study_group.study_group.StudyGroup;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream() {
        this.studyGroups = new ArrayList<>();
    }

    public void addStudyGroup(StudyGroup studyGroup) {
        this.studyGroups.add(studyGroup);
    }

    public List<StudyGroup> getStudyGroups() {
        return this.studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return this.studyGroups.iterator();
    }
}
