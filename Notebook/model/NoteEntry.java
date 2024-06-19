package Notebook.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class NoteEntry implements Entry, Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String description;
    private LocalDateTime dateTime;

    public NoteEntry(String title, String description, LocalDateTime dateTime) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
