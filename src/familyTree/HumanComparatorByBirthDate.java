package familyTree;

import human.Human;

import java.util.Comparator;

public class HumanComparatorByBirthDate<T extends TreeNode<T>> implements Comparator<T> {
    @Override
    public int compare(T h1, T h2){return h1.getBirthDate().compareTo(h2.getBirthDate());}
}
