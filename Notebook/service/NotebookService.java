package Notebook.service;

import Notebook.model.Entry;
import Notebook.model.NoteEntry;
import Notebook.model.NoteInterface;
import Notebook.utils.FileHandler;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class NotebookService implements Serializable {
    private NoteInterface notebook;

    public NotebookService(NoteInterface notebook) {
        this.notebook = notebook;
    }

    public void addEntry(String title, String description, LocalDateTime dateTime) {
        Entry entry = new NoteEntry(title, description, dateTime);
        notebook.addEntry(entry);
    }

    public NoteInterface getNotebook() {
        return notebook;
    }

    public List<Entry> findEntriesByDay(LocalDate date) {
        return notebook.getEntries().stream()
                .filter(entry -> entry.getDateTime().toLocalDate().equals(date))
                .collect(Collectors.toList());
    }

    public void saveNotebook(String filename) {
        FileHandler.saveToFile(notebook, filename);
    }

    public NoteInterface loadNotebook(String filename) {
        return (NoteInterface) FileHandler.loadFromFile(filename);
    }

    public void setNotebook(NoteInterface notebook) {
        this.notebook = notebook;
    }
}
