package OOP.family_tree.view;

import OOP.family_tree.model.*;
import OOP.family_tree.presenter.FamilyTreePresenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleFamilyTreeView implements FamilyTreeView<Human> {
    private FamilyTreePresenter presenter;
    private Scanner scanner;

    public ConsoleFamilyTreeView() {
        this.scanner = new Scanner(System.in);
    }

    public void setPresenter(FamilyTreePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayMember(Human member) {
        System.out.println("Имя: " + member.getName() + ", Дата Рождения: " + member.getBirthDate());
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

    public void interact() {
        while (true) {
            System.out.println("\nВыберите опцию:");
            System.out.println("1. Добавить участника");
            System.out.println("2. Найти участника по имени");
            System.out.println("3. Отсортировать участников по имени");
            System.out.println("4. Отсортировать участников по дате рождения");
            System.out.println("5. Сохранить семейное дерево");
            System.out.println("6. Загрузить семейное дерево");
            System.out.println("7. Добавить ребенка к родителю");
            System.out.println("8. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    findMemberByName();
                    break;
                case 3:
                    presenter.sortByName();
                    break;
                case 4:
                    presenter.sortByBirthDate();
                    break;
                case 5:
                    saveFamilyTree();
                    break;
                case 6:
                    loadFamilyTree();
                    break;
                case 7:
                    addChildToMember();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private void addMember() {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите пол (Male/Female): ");
        Gender gender = Gender.valueOf(scanner.nextLine());
        System.out.print("Введите дату рождения (YYYY-MM-DD): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        Human member = new Human(name, gender, birthDate);
        presenter.addMember(member);
    }

    private void findMemberByName() {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        presenter.findMemberByName(name);
    }

    private void saveFamilyTree() {
        System.out.print("Введите имя файла: ");
        String filename = scanner.nextLine();
        presenter.saveFamilyTree(filename);
    }

    private void loadFamilyTree() {
        System.out.print("Введите имя файла: ");
        String filename = scanner.nextLine();
        presenter.loadFamilyTree(filename);
    }

    private void addChildToMember() {
        System.out.print("Введите имя родителя: ");
        String parentName = scanner.nextLine();
        Human parent = (Human) presenter.findMemberByName(parentName);
        if (parent == null) {
            System.out.println("Родитель не найден.");
            return;
        }
        System.out.print("Введите имя ребенка: ");
        String childName = scanner.nextLine();
        System.out.print("Введите пол ребенка (Male/Female): ");
        Gender childGender = Gender.valueOf(scanner.nextLine());
        System.out.print("Введите дату рождения ребенка (YYYY-MM-DD): ");
        LocalDate childBirthDate = LocalDate.parse(scanner.nextLine());
        Human child = new Human(childName, childGender, childBirthDate);
        presenter.addChild(parent, child);
    }
}
