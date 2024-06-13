package OOP.family_tree.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface FamilyMember<T extends FamilyMember<T>> extends Serializable {
    String getName();
    LocalDate getBirthDate();
    List<T> getChildren();
}
