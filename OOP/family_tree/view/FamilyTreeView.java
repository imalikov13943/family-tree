package OOP.family_tree.view;

import OOP.family_tree.model.Human;
import OOP.family_tree.model.FamilyTree;

public interface FamilyTreeView {
    void displayMember(Human member);
    void displayMessage(String message);
    void displayMembers(FamilyTree<Human> familyTree);
}
