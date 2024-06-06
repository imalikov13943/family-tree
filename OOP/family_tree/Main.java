package OOP.family_tree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human parent1 = new Human("Петр", Gender.Male, LocalDate.of(1980, 1, 1));
        Human parent2 = new Human("Клара", Gender.Female, LocalDate.of(1982, 5, 15));
        Human child1 = new Human("Федор", Gender.Male, LocalDate.of(2005, 8, 10));
        Human child2 = new Human("Алена", Gender.Female, LocalDate.of(2008, 3, 22));

        parent1.addChild(child1);
        parent1.addChild(child2);
        parent2.addChild(child1);
        parent2.addChild(child2);

        child1.setFather(parent1);
        child1.setMother(parent2);
        child2.setFather(parent1);
        child2.setMother(parent2);

        Familytree familyTree = new Familytree();
        familyTree.addMember(parent1);
        familyTree.addMember(parent2);
        familyTree.addMember(child1);
        familyTree.addMember(child2);

        System.out.println("Family Tree Members:");
        for (Human member : familyTree) {
            System.out.println(member.getName());
        }

        System.out.println("\nFamily Tree Members sorted by Name:");
        familyTree.sortByName();
        for (Human member : familyTree) {
            System.out.println(member.getName());
        }

        System.out.println("\nFamily Tree Members sorted by Birth Date:");
        familyTree.sortByBirthDate();
        for (Human member : familyTree) {
            System.out.println(member.getName() + " - " + member.getBirthDate());
        }
    }
}



