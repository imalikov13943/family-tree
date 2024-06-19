package Notebook;

import Notebook.model.Notebook;
import Notebook.presenter.NotebookPresenter;
import Notebook.view.ConsoleNotebookView;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        ConsoleNotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new NotebookPresenter(view, notebook);
        view.interact();
    }
}



