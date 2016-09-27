import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Oleh on 27.09.2016.
 */
public class HashMapAgainstTreeMap {
    Map<Long, String> hashMap = new HashMap();
    Map<Long, String> treeMap = new TreeMap();

    long howMuchElements = 10000;
    long durationForAddElementHashMap;
    long durationForGetElementHashMap;
    long durationForRemoveElementHashMap;
    long durationForAddElementTreeMap;
    long durationForGetElementTreeMap;
    long durationForRemoveElementTreeMap;

    public static void main(String[] args) {
        HashMapAgainstTreeMap test = new HashMapAgainstTreeMap();
        test.addElementHashMap();
        test.getElementHashMap();
        test.removeElementHashMapUsingLoop();
        test.addElementTreeMap();
        test.getElementTreeMap();
        test.removeElementTreeMapUsingLoop();
        test.getInfo();
    }

    public void addElementHashMap() {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < howMuchElements; i++) {
            hashMap.put(i, "value " + i);
//            System.out.println(hashMap.get(i));
        }
//
        long endTime = System.currentTimeMillis();
        durationForAddElementHashMap = endTime - startTime;
//        System.out.println( "duration" + durationForAddElementHashMap);
    }

    public void removeElementHashMapUsingIterator() {
        addElementHashMap();
        Iterator<HashMap.Entry<Long, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            System.out.println("size new " + hashMap.size());
        }
    }

    public void getElementHashMap() {
        long startTime = System.currentTimeMillis();
        addElementHashMap();
        for (long i = 0; i < howMuchElements; i++) {
            hashMap.get(i);
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        durationForGetElementHashMap = endTime - startTime;
    }

    public void removeElementHashMapUsingLoop() {
        long startTime = System.currentTimeMillis();
        addElementHashMap();
        for (long i = howMuchElements; i >= 0; i--) {
            hashMap.remove(i);
//            System.out.println(hashMap.size());
        }
        long endTime = System.currentTimeMillis();
        durationForRemoveElementHashMap = endTime - startTime;
    }

    public void addElementTreeMap() {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < howMuchElements; i++) {
            treeMap.put(i, "value " + i);
        }
        long endTime = System.currentTimeMillis();
        durationForAddElementTreeMap = endTime - startTime;
    }

    public void getElementTreeMap() {
        long startTime = System.currentTimeMillis();
        addElementTreeMap();
        for (long i = 0; i < howMuchElements; i++) {
            treeMap.get(i);
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        durationForGetElementTreeMap = endTime - startTime;
    }

    public void removeElementTreeMapUsingLoop() {
        long startTime = System.currentTimeMillis();
        addElementHashMap();
        for (long i = howMuchElements; i >= 0; i--) {
            treeMap.remove(i);
        }
        long endTime = System.currentTimeMillis();
        durationForRemoveElementTreeMap = endTime - startTime;
    }


    public void getInfo() {
        System.out.println("Add element HashMap = " + durationForAddElementHashMap + " millisecond");
        System.out.println("Add element TreeMap = " + durationForAddElementTreeMap + " millisecond \n");

        System.out.println("Get element HashMap = " + durationForGetElementHashMap + " millisecond");
        System.out.println("Get element TreeMap = " + durationForGetElementTreeMap + " millisecond \n");

        System.out.println("Remove element HashMap = " + durationForRemoveElementHashMap + " millisecond");
        System.out.println("Remove element TreeMap = " + durationForRemoveElementTreeMap + " millisecond");
    }

}

