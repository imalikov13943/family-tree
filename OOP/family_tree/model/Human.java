package OOP.family_tree.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements FamilyMember<Human> {
    private static final long serialVersionUID = 1L;

    private String name;
    private Human mother;
    private Human father;
    private List<Human> children;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Gender gender;

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

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    @Override
    public List<Human> getChildren() {
        return children;
    }

    public void addChild(Human child) {
        this.children.add(child);
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public Gender getGender() {
        return gender;
    }
}
