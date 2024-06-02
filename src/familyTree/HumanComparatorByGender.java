package familyTree;

import human.Human;

import java.util.Comparator;

public class HumanComparatorByGender<T extends TreeNode<T>> implements Comparator<T> {
    @Override
    public int compare(T h1, T h2){return h1.getGender().compareTo(h2.getGender());}
}
