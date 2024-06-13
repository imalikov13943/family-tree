package OOP.family_tree;

import OOP.family_tree.model.*;
import OOP.family_tree.presenter.FamilyTreePresenter;
import OOP.family_tree.view.ConsoleFamilyTreeView;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Human> familyTree = new FamilyTree<>();
        ConsoleFamilyTreeView view = new ConsoleFamilyTreeView();
        FamilyTreePresenter presenter = new FamilyTreePresenter(view, familyTree);

        Human parent1 = new Human("Петр", Gender.Male, LocalDate.of(1980, 1, 1));
        Human parent2 = new Human("Клара", Gender.Female, LocalDate.of(1982, 5, 15));
        Human child1 = new Human("Федор", Gender.Male, LocalDate.of(2005, 8, 10));
        Human child2 = new Human("Алена", Gender.Female, LocalDate.of(2008, 3, 22));

        presenter.addMember(parent1);
        presenter.addMember(parent2);
        presenter.addMember(child1);
        presenter.addMember(child2);

        System.out.println("\nFind Member by Name:");
        presenter.findMemberByName("Петр");

        System.out.println("\nFamily Tree Members sorted by Name:");
        presenter.sortByName();

        System.out.println("\nFamily Tree Members sorted by Birth Date:");
        presenter.sortByBirthDate();
    }
}


