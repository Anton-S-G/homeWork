import familyTree.FamilyTree;
import human.Gender;
import human.Human;
import save.FileHandler;
import save.Writable;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String filePath = "tree.txt";
//        FamilyTree tree = new FamilyTree();
//        FamilyTree tree = firstTree();
        FamilyTree tree = load(filePath);
        System.out.println(tree);

        save(tree, filePath);
    }

        private static FamilyTree load(String filePath){
            Writable writable = new FileHandler();
            return (FamilyTree) writable.read(filePath);
        }

        private static void save(FamilyTree tree, String filePath){
            Writable writable = new FileHandler();
            writable.save(tree, filePath);
        }

        private static FamilyTree firstTree() {
            FamilyTree tree = new FamilyTree();

            Human sergey = new Human("Сергей", Gender.Male, LocalDate.of(1975, 10, 10));
            Human nataly = new Human("Наталья", Gender.Female, LocalDate.of(1980, 5, 5));

            tree.add(sergey);
            tree.add(nataly);
            tree.setWedding(sergey.getId(), nataly.getId());

            Human vasilina = new Human("Василина", Gender.Female, LocalDate.of(1999, 7, 4), sergey, nataly);
            Human sema = new Human("Семён", Gender.Male, LocalDate.of(2005, 8, 3), sergey, nataly);

            tree.add(vasilina);
            tree.add(sema);

            Human grandMother = new Human("Ирина", Gender.Female, LocalDate.of(1950, 10, 15));
            grandMother.addChild(sergey);

            tree.add(grandMother);

            return tree;
        }
    }
