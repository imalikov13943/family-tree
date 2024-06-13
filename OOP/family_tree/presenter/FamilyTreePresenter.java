package OOP.family_tree.presenter;

import OOP.family_tree.model.FamilyTree;
import OOP.family_tree.model.Human;
import OOP.family_tree.view.FamilyTreeView;

public class FamilyTreePresenter {
    private FamilyTreeView view;
    private FamilyTree<Human> model;

    public FamilyTreePresenter(FamilyTreeView view, FamilyTree<Human> model) {
        this.view = view;
        this.model = model;
    }

    public void addMember(Human member) {
        model.addMember(member);
    }

    public void findMemberByName(String name) {
        Human member = model.findMemberByName(name);
        if (member != null) {
            view.displayMember(member);
        } else {
            view.displayMessage("Member not found");
        }
    }

    public void sortByName() {
        model.sortByName();
        view.displayMembers(model);
    }

    public void sortByBirthDate() {
        model.sortByBirthDate();
        view.displayMembers(model);
    }
}
