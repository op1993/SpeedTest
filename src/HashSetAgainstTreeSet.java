import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Oleh on 26.09.2016.
 */
public class HashSetAgainstTreeSet {
    TreeSet treeSet = new TreeSet();
    HashSet hashSet = new HashSet();
    long howMuchElements = 100000;
    long durationHashSetAddElement;
    long durationTreeSetAddElement;
    long durationHashSetFindElement;
    long durationTreeSetFindElement;
    long durationForDeleteTreeSet;


    public void addToHashSet() {
        long startTime = System.nanoTime();
        for (long i = 0; i < howMuchElements; i++) {
            hashSet.add(i);
//            System.out.println(i);
        }
        long endTime = System.nanoTime();
        durationHashSetAddElement = endTime - startTime;}

    public void addToTreeSet() {
        long startTime = System.nanoTime();
        for (long i = 0; i < howMuchElements; i++) {
            treeSet.add(i);
//            System.out.println(i);
        }
        long endTime = System.nanoTime();
        durationTreeSetAddElement = endTime - startTime;
    }

    public void findElementHashSet(){
    addToHashSet();
        long startTime = System.nanoTime();
        for (long i = 0; i < howMuchElements; i ++){
            hashSet.contains(i);
        }
        long endTime = System.nanoTime();
        durationHashSetFindElement = endTime - startTime;
        System.out.println(durationHashSetFindElement);
    }
    public void findElementTreeSet(){
        addToTreeSet();
        long startTime = System.nanoTime();
        for (long i = 0; i < howMuchElements; i ++){
            treeSet.contains(i);
        }
        long endTime = System.nanoTime();
        durationTreeSetFindElement = endTime - startTime;
        System.out.println(durationTreeSetFindElement);
    }

    public void removeTreeSet(){
        addToTreeSet();
        long startTime = System.currentTimeMillis();
        for (long i = howMuchElements; i >=0; i --){
            treeSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
        durationForDeleteTreeSet = endTime -startTime;

    }

    public void removeHashSet(){
        addToHashSet();
        long startTime = System.currentTimeMillis();
        for (long i = howMuchElements; i >=0; i --){
            hashSet.remove(i);
        }
        long endTime = System.currentTimeMillis();
//        durationForDeleteHashSet = endTime -startTime;

    }

    public void hashMap(){
        HashMap hashMap = new HashMap();
        hashMap.put(10,1);
        hashMap.get(4);
        System.out.println(4);

    }


    public static void main(String[] args) {
        HashSetAgainstTreeSet test = new HashSetAgainstTreeSet();
//        teste.findElementHashSet();
//        teste.removeTreeSet();
//        System.out.println(teste.durationForDeleteTreeSet);
        test.hashMap();
    }
}

