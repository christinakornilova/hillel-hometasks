package hillel.hometask.ht23;

public class MainTest {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Single Linked List Test");

        System.out.println("Add elements to the list and show them: ");
        list.add("HTC");
        list.add("Moto");
        list.add("iPhone");
        list.add("Meizu");
        list.add("Xiaomi");

        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Insert new element after HTC: ");
        list.add("Doogee",1);
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Is our list empty: " + list.isEmpty());
        System.out.println("List size is: " + list.getSize());
        System.out.println("------------------------");

        System.out.println("Delete element =Meizu= from the list: ");
        list.remove("Meizu");
        System.out.println(list.toString());
        System.out.println("Does list contain element =Meizu=: " + list.contains("Meizu"));
        System.out.println("------------------------");

        System.out.println("Delete nonexistent element: ");
        list.remove(" ");
        System.out.println("Delete element with index = -1: ");
        list.remove(-1);
        System.out.println("Delete element with index > size: ");
        list.remove(list.getSize()*2);
        System.out.println("------------------------");

        System.out.println("Set 3rd element of the list to =Motorola=: ");
        list.set(2, "Motorola");
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Try to add element to -1 position: ");
        list.add("Data", -1);
        System.out.println("Try to add element to position 100: ");
        list.add("Data", 100);
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Remove last element of the list = Xiaomi=: ");
        list.remove();
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Add new element to the list: ");
        list.add("Samsung",3);
        System.out.println("Remove all elements from list: ");
        list.clear();
        System.out.println(list.toString());







    }
}
