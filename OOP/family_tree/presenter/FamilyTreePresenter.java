package OOP.family_tree.presenter;

import OOP.family_tree.model.FamilyMember;
import OOP.family_tree.model.FamilyTree;
import OOP.family_tree.service.FamilyTreeService;
import OOP.family_tree.view.FamilyTreeView;

public class FamilyTreePresenter<T extends FamilyMember<T>> {
    private FamilyTreeView<T> view;
    private FamilyTreeService<T> service;

    public FamilyTreePresenter(FamilyTreeView<T> view, FamilyTree<T> model) {
        this.view = view;
        this.service = new FamilyTreeService<>(model);
        view.setPresenter(this);
    }

    public void addMember(T member) {
        service.addMember(member);
        view.displayMessage("Участник добавлен: " + member.getName());
    }

    public T findMemberByName(String name) {
        T member = service.findMemberByName(name);
        if (member != null) {
            view.displayMember(member);
        } else {
            view.displayMessage("Участник не найден");
        }
        return member;
    }

    public void sortByName() {
        service.sortByName();
        view.displayMembers(service.getFamilyTree());
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
        view.displayMembers(service.getFamilyTree());
    }

    public void saveFamilyTree(String filename) {
        service.saveFamilyTree(filename);
        view.displayMessage("Семейное дерево сохранено в " + filename);
    }

    public void loadFamilyTree(String filename) {
        FamilyTree<T> loadedTree = service.loadFamilyTree(filename);
        if (loadedTree != null) {
            service.setFamilyTree(loadedTree);
            view.displayMessage("Семейное дерево загружено из " + filename);
            view.displayMembers(loadedTree);
        } else {
            view.displayMessage("Не удалось загрузить семейное дерево из " + filename);
        }
    }

    public void addChild(T parent, T child) {
        service.addChild(parent, child);
        view.displayMessage("Ребенок " + child.getName() + " добавлен к родителю " + parent.getName());
    }
}
