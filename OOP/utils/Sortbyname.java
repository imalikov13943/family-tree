package OOP.utils;

import OOP.family_tree.Human;
import java.util.Comparator;

public class Sortbyname implements Comparator<Human> {
    @Override
    public int compare(Human a, Human b) {
        return a.getName().compareTo(b.getName());
    }
}
