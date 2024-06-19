package Notebook.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Notebook implements NoteInterface, Serializable {
    private static final long serialVersionUID = 1L;
    private List<Entry> entries;

    public Notebook() {
        this.entries = new ArrayList<>();
    }

    @Override
    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    @Override
    public List<Entry> getEntries() {
        return entries;
    }
}
