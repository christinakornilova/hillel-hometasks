package hillel.hometask.ht28;

public class MainTest {
    public static void main(String[] args) {
        LinkedListGeneric<String> list = new LinkedListGeneric<>();
        System.out.println("Singly Linked List Generic Test");
        String s[] = {"JaredLeto", "ShannonLeto", "Tomo", "StephenAiello",
                "30SecondsToMars", "ABeautifulLie", "ThisIsWar", "LoveLustFaithAndDreams",
                "WalkOnWater"};

        System.out.println("Add elements to the list and show them: ");
        list.fillList(s,list);

        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Insert new element after 1st one: ");
        list.add("30STM",1);
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Is our list empty: " + list.isEmpty());
        System.out.println("List size is: " + list.getSize());
        System.out.println("------------------------");

        System.out.println("Delete element =30STM= from the list: ");
        list.remove("30STM");
        System.out.println(list.toString());

        System.out.println("List contains element =30STM=: " + list.contains("30STM"));
        System.out.println("------------------------");

        System.out.println("Delete nonexistent element: ");
        list.remove(" ");

        System.out.println("Delete element with index = -1: ");
        list.remove(-1);
        System.out.println("Delete element with index > size: ");
        list.remove(list.getSize()*2);
        System.out.println("------------------------");

        System.out.println("Set 4th element of the list to =Echelone=: ");
        list.set(3, "Echelone");
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Try to add element to -1 position: ");
        list.add("Data", -1);
        System.out.println("Try to add element to position 100: ");
        list.add("Data", 100);
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Remove last element of the list = Walk on Water =: ");
        list.remove();
        System.out.println(list.toString());
        System.out.println("------------------------");

        System.out.println("Add new element to the list: ");
        list.add("Mars camp");
        System.out.println(list.toString());
        System.out.println("------------------------");
        System.out.print("Remove all elements from list: ");
        list.clear();
        System.out.println(list.toString());
        System.out.println("------------------------");
    }
}
