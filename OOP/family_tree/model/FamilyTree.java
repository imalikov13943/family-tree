package OOP.family_tree.model;

import OOP.family_tree.utils.Sortbyname;
import OOP.family_tree.utils.Sortbybirthdate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends FamilyMember<T>> implements Serializable, Iterable<T> {
    private static final long serialVersionUID = 1L;

    private List<T> members;

    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    public void addMember(T member) {
        this.members.add(member);
    }

    public List<T> getChildrenOf(T parent) {
        return parent.getChildren();
    }

    public T findMemberByName(String name) {
        for (T member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    public void sortByName() {
        Collections.sort(members, new Sortbyname<>());
    }

    public void sortByBirthDate() {
        Collections.sort(members, new Sortbybirthdate<>());
    }

    @Override
    public Iterator<T> iterator() {
        return members.iterator();
    }
}
