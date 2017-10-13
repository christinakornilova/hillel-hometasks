package hillel.hometask.ht24;

public class TestMain {
    public static void main(String[] args) {
        DoublyLinkedList stringList = new DoublyLinkedList();
        stringList.addFirst("second");
        stringList.addFirst("first");
        stringList.addLast("third");
        stringList.addLast("fourth");
        System.out.println("---------");
        System.out.println("The list is empty: " + stringList.isEmpty());
        System.out.println("---------");
        System.out.println("Iterating forward: ");
        stringList.iterateForward();
        System.out.println("\n" +"---------");
        stringList.removeFirst();
        stringList.removeLast();
        System.out.println("---------");
        System.out.println("Iterating backword: ");
        stringList.iterateBackward();
        System.out.println();
        System.out.println("---------");
        System.out.println("List size is: " + stringList.size());
    }
}
