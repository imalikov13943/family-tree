package Notebook.model;

import java.util.List;

public interface NoteInterface {
    void addEntry(Entry entry);
    List<Entry> getEntries();
}
