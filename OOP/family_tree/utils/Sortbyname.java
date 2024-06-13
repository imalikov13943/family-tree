package OOP.family_tree.utils;

import OOP.family_tree.model.FamilyMember;
import java.util.Comparator;

public class Sortbyname<T extends FamilyMember<T>> implements Comparator<T> {
    @Override
    public int compare(T member1, T member2) {
        return member1.getName().compareTo(member2.getName());
    }
}
