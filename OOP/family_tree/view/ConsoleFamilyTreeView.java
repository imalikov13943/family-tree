package OOP.family_tree.view;

import OOP.family_tree.model.Human;
import OOP.family_tree.model.FamilyTree;

public class ConsoleFamilyTreeView implements FamilyTreeView {

    @Override
    public void displayMember(Human member) {
        System.out.println("Name: " + member.getName() + ", Birth Date: " + member.getBirthDate());
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void displayMembers(FamilyTree<Human> familyTree) {
        for (Human member : familyTree) {
            displayMember(member);
        }
    }
}
