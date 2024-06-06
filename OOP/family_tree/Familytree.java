package OOP.family_tree;

import OOP.utils.Sortbyname;
import OOP.utils.Sortbybirthdate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Familytree implements Serializable, Iterable<Human> {
    private static final long serialVersionUID = 1L;

    private List<Human> members;

    public Familytree() {
        this.members = new ArrayList<>();
    }

    public void addMember(Human human) {
        this.members.add(human);
    }

    public List<Human> getChildrenOf(Human parent) {
        return parent.getChildren();
    }

    public Human findMemberByName(String name) {
        for (Human member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    public void sortByName() {
        Collections.sort(members, new Sortbyname());
    }

    public void sortByBirthDate() {
        Collections.sort(members, new Sortbybirthdate());
    }

    @Override
    public Iterator<Human> iterator() {
        return members.iterator();
    }
}
