import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Oleh on 25.09.2016.
 */
public class ArrayListAgainstLinkedList {

    public long durationArrayListAddElement;
    public long durationLinkedListAddElement;
    public long durationFindElementsLinkedList;
    public long durationFindElementsArrayList;
    public long durationForRemoveArrayList;
    public long durationForRemoveLinkedList;


    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();
    long howMuchElements = 30000;

    public static void main(String[] args) {
        ArrayListAgainstLinkedList speedTest = new ArrayListAgainstLinkedList();
        speedTest.addToArrayList();
        speedTest.addToLinkedList();
        speedTest.getElementArrayList();
        speedTest.getElementLinkedList();
        speedTest.removeElementArrayList();
        speedTest.removeElementLinkedList();
        speedTest.info();
    }

    public void addToArrayList() {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < howMuchElements; i++) {
            arrayList.add(i);
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        durationArrayListAddElement = endTime - startTime;
//        System.out.println("ArrayList list finished in :  " + durationArrayListAddElement + "nano sec");
    }

    public void addToLinkedList() {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < howMuchElements; i++) {
            linkedList.add(i);
//            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        durationLinkedListAddElement = endTime - startTime;
//        System.out.println("Linked list finished in :  " + durationLinkedListAddElement + "nano sec");
    }

    public void getElementArrayList() {
//        System.out.println("Creating arrayList");
        addToArrayList();
//        System.out.println("Start searching");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < howMuchElements; i++) {
            arrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        durationFindElementsArrayList = endTime - startTime;
//        System.out.println("ArrayList get:  " + durationFindElementsArrayList);
    }

    public void getElementLinkedList() {
//        System.out.println("Creating linkedList");
        addToLinkedList();
//        System.out.println("Start searching");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < howMuchElements; i++) {
            linkedList.get(i);
        }
        long endTime = System.currentTimeMillis();
        durationFindElementsLinkedList = endTime - startTime;
//        System.out.println("Linked get:  " + durationFindElementsLinkedList);
    }

    public void removeElementArrayList() {
        addToArrayList();
        long startTime = System.currentTimeMillis();
        for (long i = howMuchElements; i >= 0; i--) {
            arrayList.remove(i);
        }
        long endTime = System.currentTimeMillis();
        durationForRemoveArrayList = endTime - startTime;
//        System.out.println("ArrayList remove:  " + durationForRemoveArrayList);
    }

    public void removeElementLinkedList() {
        addToLinkedList();
        long startTime = System.currentTimeMillis();
        for (long i = howMuchElements; i >= 0; i--) {
            linkedList.remove(i);
        }
        long endTime = System.currentTimeMillis();
        durationForRemoveLinkedList = endTime - startTime;
//        System.out.println("Linked remove:  " + durationForRemoveLinkedList);
    }

    public void info() {
        System.out.println("Add element. Linked list finished in :  " + durationLinkedListAddElement  + " millisecond");
        System.out.println("Add element. ArrayList list finished in : " + durationArrayListAddElement + " millisecond \n");
        System.out.println("Find element. ArrayList: " + durationFindElementsArrayList  + " millisecond");
        System.out.println("Find element. LinkedList: " + durationFindElementsLinkedList  + " millisecond \n");
        System.out.println("Remove element. ArrayList :" + durationForRemoveArrayList  + " millisecond ");
        System.out.println("Remove element. Linked list :" + durationForRemoveLinkedList  + " millisecond \n");
    }
}