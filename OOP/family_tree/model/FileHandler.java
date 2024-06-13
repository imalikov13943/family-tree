package OOP.family_tree.model;

import java.io.*;

public class FileHandler<T extends FamilyMember<T>> implements Serializable {
    private FamilyTree<T> familyTree;

    public FileHandler(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
    }

    public void serialize(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(familyTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            familyTree = (FamilyTree<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FamilyTree<T> getFamilyTree() {
        return familyTree;
    }
}
