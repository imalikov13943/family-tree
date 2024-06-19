package Notebook.view;

import Notebook.model.Entry;
import Notebook.model.NoteInterface;
import Notebook.presenter.NotebookPresenter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleNotebookView implements NoteView {
    private NotebookPresenter presenter;
    private Scanner scanner;

    public ConsoleNotebookView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(NotebookPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayEntries(NoteInterface notebook) {
        List<Entry> entries = notebook.getEntries();
        if (entries.isEmpty()) {
            System.out.println("Записей нет.");
        } else {
            for (Entry entry : entries) {
                System.out.println("Заголовок: " + entry.getTitle());
                System.out.println("Описание: " + entry.getDescription());
                System.out.println("Дата и время: " + entry.getDateTime());
                System.out.println("-----------------------");
            }
        }
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void interact() {
        while (true) {
            System.out.println("\nВыберите опцию:");
            System.out.println("1. Добавить запись");
            System.out.println("2. Показать все записи");
            System.out.println("3. Найти записи на день");
            System.out.println("4. Сохранить записную книжку");
            System.out.println("5. Загрузить записную книжку");
            System.out.println("6. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addEntryInteractive();
                    break;
                case 2:
                    presenter.showAllEntries();
                    break;
                case 3:
                    findEntriesByDay();
                    break;
                case 4:
                    saveNotebook();
                    break;
                case 5:
                    loadNotebook();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private void addEntryInteractive() {
        System.out.print("Введите заголовок: ");
        String title = scanner.nextLine();
        System.out.print("Введите описание: ");
        String description = scanner.nextLine();
        System.out.print("Введите дату и время (YYYY-MM-DD HH:MM): ");
        String dateTimeString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        presenter.addEntry(title, description, dateTime);
    }

    private void findEntriesByDay() {
        System.out.print("Введите дату (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        presenter.findEntriesByDay(date);
    }

    private void saveNotebook() {
        System.out.print("Введите имя файла: ");
        String filename = scanner.nextLine();
        presenter.saveNotebook(filename);
    }

    private void loadNotebook() {
        System.out.print("Введите имя файла: ");
        String filename = scanner.nextLine();
        presenter.loadNotebook(filename);
    }
}
