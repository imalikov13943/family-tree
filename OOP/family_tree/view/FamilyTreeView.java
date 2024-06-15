package OOP.family_tree.view;

import OOP.family_tree.model.FamilyMember;
import OOP.family_tree.model.FamilyTree;
import OOP.family_tree.presenter.FamilyTreePresenter;

public interface FamilyTreeView<T extends FamilyMember<T>> {
    void displayMember(T member);
    void displayMessage(String message);
    void displayMembers(FamilyTree<T> familyTree);
    void setPresenter(FamilyTreePresenter<T> presenter);
}
