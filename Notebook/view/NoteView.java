package Notebook.view;

import Notebook.model.NoteInterface;
import Notebook.presenter.NotebookPresenter;

public interface NoteView {
    void setPresenter(NotebookPresenter presenter);
    void displayEntries(NoteInterface notebook);
    void displayMessage(String message);
}
