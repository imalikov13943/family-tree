package OOP.family_tree.service;

import OOP.family_tree.model.*;
import OOP.family_tree.utils.FileHandler;

public class FamilyTreeService<T extends FamilyMember<T>> {
    private FamilyTree<T> familyTree;
    private FileHandler fileHandler;

    public FamilyTreeService(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
        this.fileHandler = new FileHandler();
    }

    public void addMember(T member) {
        familyTree.addMember(member);
    }

    public T findMemberByName(String name) {
        return familyTree.findMemberByName(name);
    }

    public void sortByName() {
        familyTree.sortByName();
    }

    public void sortByBirthDate() {
        familyTree.sortByBirthDate();
    }

    public void saveFamilyTree(String filename) {
        fileHandler.saveToFile(familyTree, filename);
    }

    public FamilyTree<T> loadFamilyTree(String filename) {
        return fileHandler.loadFromFile(filename);
    }

    public void addChild(T parent, T child) {
        parent.getChildren().add(child);
        addMember(child);
    }

    public FamilyTree<T> getFamilyTree() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFamilyTree'");
    }

    public void setFamilyTree(FamilyTree<T> loadedTree) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFamilyTree'");
    }
}
