package OOP.family_tree;

import OOP.family_tree.model.*;
import OOP.family_tree.presenter.FamilyTreePresenter;
import OOP.family_tree.view.ConsoleFamilyTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Human> familyTree = new FamilyTree<>();
        ConsoleFamilyTreeView view = new ConsoleFamilyTreeView();
        FamilyTreePresenter presenter = new FamilyTreePresenter(view, familyTree);
        view.interact();
    }
}
