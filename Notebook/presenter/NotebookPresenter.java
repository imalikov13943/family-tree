package Notebook.presenter;

import Notebook.model.Entry;
import Notebook.model.NoteInterface;
import Notebook.service.NotebookService;
import Notebook.view.NoteView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class NotebookPresenter {
    private NoteView view;
    private NotebookService service;

    public NotebookPresenter(NoteView view, NoteInterface model) {
        this.view = view;
        this.service = new NotebookService(model);
        view.setPresenter(this);
    }

    public void addEntry(String title, String description, LocalDateTime dateTime) {
        service.addEntry(title, description, dateTime);
        view.displayMessage("Запись добавлена: " + title);
    }

    public void showAllEntries() {
        view.displayEntries(service.getNotebook());
    }

    public void findEntriesByDay(String date) {
        LocalDate localDate = LocalDate.parse(date);
        List<Entry> entries = service.findEntriesByDay(localDate);
        if (entries.isEmpty()) {
            view.displayMessage("Записей на выбранный день нет.");
        } else {
            for (Entry entry : entries) {
                view.displayMessage("Заголовок: " + entry.getTitle() + "\nОписание: " + entry.getDescription() + "\nДата и время: " + entry.getDateTime());
            }
        }
    }

    public void saveNotebook(String filename) {
        service.saveNotebook(filename);
        view.displayMessage("Записная книжка сохранена в " + filename);
    }

    public void loadNotebook(String filename) {
        NoteInterface loadedNotebook = service.loadNotebook(filename);
        if (loadedNotebook != null) {
            service.setNotebook(loadedNotebook);
            view.displayMessage("Записная книжка загружена из " + filename);
            view.displayEntries(loadedNotebook);
        } else {
            view.displayMessage("Не удалось загрузить записную книжку из " + filename);
        }
    }
}
