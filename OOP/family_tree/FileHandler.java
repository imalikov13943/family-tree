package OOP.family_tree;

import java.io.*;

public class FileHandler implements Serializable {
    private Familytree familyTree;

    public FileHandler(Familytree familyTree) {
        this.familyTree = familyTree;
    }

    @Override
    public void serialize(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(familyTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            familyTree = (Familytree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Familytree getFamilyTree() {
        return familyTree;
    }
}
