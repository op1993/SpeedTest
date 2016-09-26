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
    long howMuchElements = 100000;

    public static void main(String[] args) {
        ArrayListAgainstLinkedList speedTest = new ArrayListAgainstLinkedList();
//        speedTest.addToArrayList();
//        speedTest.AddToLinkedList();
//
        speedTest.findElementArrayList();
        speedTest.findElementLinkedList();
        speedTest.removeElementArrayList();
        speedTest.removeElementLinkedList();
        speedTest.info();
    }

    public void addToArrayList() {
        long startTime = System.nanoTime();
        for (long i = 0; i < howMuchElements; i++) {
            arrayList.add(i);
//            System.out.println(i);
        }
        long endTime = System.nanoTime();
        durationArrayListAddElement = endTime - startTime;
//        System.out.println("ArrayList list finished in :  " + durationArrayListAddElement + "nano sec");
    }

    public void AddToLinkedList() {
        long startTime = System.nanoTime();
        for (long i = 0; i < howMuchElements; i++) {
            linkedList.add(i);
//            System.out.println(i);
        }
        long endTime = System.nanoTime();
        durationLinkedListAddElement = endTime - startTime;
//        System.out.println("Linked list finished in :  " + durationLinkedListAddElement + "nano sec");
    }

    public void findElementArrayList() {
        System.out.println("Creating arrayList");
        addToArrayList();
        System.out.println("Start searching");
        long startTime = System.nanoTime();
        for (int i = 0; i < howMuchElements; i++) {
            arrayList.get(i);
        }
        long endTime = System.nanoTime();
        durationFindElementsArrayList = endTime - startTime;
//        System.out.println("ArrayList get:  " + durationFindElementsArrayList);
    }

    public void findElementLinkedList() {
        System.out.println("Creating linkedList");
        AddToLinkedList();
        System.out.println("Start searching");
        long startTime = System.nanoTime();
        for (int i = 0; i < howMuchElements; i++) {
            linkedList.get(i);
        }
        long endTime = System.nanoTime();
        durationFindElementsLinkedList = endTime - startTime;
//        System.out.println("Linked get:  " + durationFindElementsLinkedList);
    }

    public void removeElementArrayList() {

        addToArrayList();
        long startTime = System.nanoTime();
        for (long i = howMuchElements; i >= 0; i--) {
            arrayList.remove(i);
        }
        long endTime = System.nanoTime();
        durationForRemoveArrayList = endTime - startTime;
        System.out.println("ArrayList remove:  " + durationForRemoveArrayList);
    }

    public void removeElementLinkedList() {

        AddToLinkedList();
        long startTime = System.nanoTime();
        for (long i = howMuchElements; i >= 0; i--) {
            linkedList.remove(i);
        }
        long endTime = System.nanoTime();
        durationForRemoveLinkedList = endTime - startTime;
        System.out.println("Linked remove:  " + durationForRemoveLinkedList);
    }

    public void info() {
        System.out.println("Add element. Linked list finished in :  " + durationLinkedListAddElement);
        System.out.println("Add element. ArrayList list finished in : " + durationArrayListAddElement);
        System.out.println("Find element. ArrayList: " + durationFindElementsArrayList);
        System.out.println("Find element. LinkedList: " + durationFindElementsLinkedList);
        System.out.println("Remove element. ArrayList :" + durationForRemoveArrayList);
        System.out.println("Remove element. Linked list :" + durationForRemoveLinkedList);
    }
}