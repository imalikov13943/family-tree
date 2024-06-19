package Notebook.model;

import java.time.LocalDateTime;

public interface Entry {
    String getTitle();
    String getDescription();
    LocalDateTime getDateTime();
}
