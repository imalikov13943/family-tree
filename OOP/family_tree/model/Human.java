package OOP.family_tree.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements FamilyMember<Human> {
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private List<Human> children;

    public Human(String name, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public List<Human> getChildren() {
        return children;
    }

    public void addChild(Human child) {
        children.add(child);
    }
}
