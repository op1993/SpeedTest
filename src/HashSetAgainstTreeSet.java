import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Oleh on 26.09.2016.
 */
public class HashSetAgainstTreeSet {
    Set<Long> treeSet = new TreeSet();
    Set<Long> hashSet = new HashSet();
    long howMuchElements = 100000;
    long durationHashSetAddElement;
    long durationTreeSetAddElement;
    long durationHashSetFindElement;
    long durationTreeSetFindElement;
    long durationForRemoveTreeSet;
    long durationForRemoveHashSet;

    public static void main(String[] args) {
        HashSetAgainstTreeSet test = new HashSetAgainstTreeSet();

        test.addToHashSet();
        test.addToTreeSet();
        test.getElementHashSet();
        test.getElementTreeSet();
        test.removeHashSet();
        test.removeTreeSet();
        test.getInfo();
    }

    public void addToHashSet() {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < howMuchElements; i++) {
            hashSet.add(i);
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        durationHashSetAddElement = endTime - startTime;
    }

    public void addToTreeSet() {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < howMuchElements; i++) {
            treeSet.add(i);
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        durationTreeSetAddElement = endTime - startTime;
        System.out.println();
    }

    public void getElementHashSet() {
        addToHashSet();
        long startTime = System.currentTimeMillis();
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
//    System.out.println("key = " + iterator.next() + "");
        }
        long endTime = System.currentTimeMillis();
        durationHashSetFindElement = endTime - startTime;

    }

    public void getElementTreeSet() {
        addToTreeSet();
        long startTime = System.currentTimeMillis();
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        durationTreeSetFindElement = endTime - startTime;
    }

    public void removeTreeSet() {
        addToTreeSet();
        long startTime = System.currentTimeMillis();
        for (long i = howMuchElements; i >= 0; i--) {
            treeSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
        durationForRemoveTreeSet = endTime - startTime;

    }

    public void removeHashSet() {
        addToHashSet();
        long startTime = System.currentTimeMillis();
        for (long i = howMuchElements; i >= 0; i--) {
            hashSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
        durationForRemoveHashSet = endTime - startTime;
    }

    public void getInfo() {
        System.out.println("Add element HashSet = " + durationHashSetAddElement + " millisecond");
        System.out.println("Add element TreeSet = " + durationTreeSetAddElement + " millisecond \n");

        System.out.println("Get element HashSet = " + durationHashSetFindElement + " millisecond");
        System.out.println("Get element TreeSet = " + durationTreeSetFindElement + " millisecond \n");

        System.out.println("Remove element HashSet = " + durationForRemoveHashSet + " millisecond");
        System.out.println("Remove element TreeSet = " + durationForRemoveTreeSet + " millisecond");
    }
}

