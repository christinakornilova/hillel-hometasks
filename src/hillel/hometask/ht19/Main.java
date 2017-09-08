package hillel.hometask.ht19;

public class Main extends IntegerContainer {
    public static void main(String[] args) {

        final int max = 100;
        final int min = -100;
        final int index = 0;

        IntegerContainer clt1 = new IntegerContainer();
        IntegerContainer clt2 = new IntegerContainer();
        IntegerContainer clt3 = new IntegerContainer(20);

        //arrays filling
        for (int i = 0; i < clt1.getSize(); i++) {
            clt1.addElement((int) (Math.random() * (max - min + 1) + min));
            clt2.addElement((int) (Math.random() * (max - min + 1) + min));
            clt3.addElement((int) (Math.random() * (max - min + 1) + min));
        }

        System.out.println("-----------------------");
        System.out.println("First array: ");
        clt1.showAllElements();
        System.out.println("Second array: ");
        clt2.showAllElements();
        System.out.println("Third array: ");
        clt3.showAllElements();

        System.out.println("-----------------------");
        clt1.contains(10);
        clt1.getIndex(100);

        System.out.println("-----------------------");
        System.out.println(index+"th element of second array is: "+clt2.getValue(index));
        System.out.println("Last element of second array is: "+clt2.getTailElement());

        System.out.println("-----------------------");
        clt3.copyAllElements(clt1);
        System.out.println("New third array: ");
        clt3.showAllElements();

        System.out.println("-----------------------");
        clt2.sortArray();
        System.out.println("Sorted second array: ");
        clt2.showAllElements();

        System.out.println("-----------------------");
        clt2.clear();
        System.out.println("Cleared second array: ");
        clt2.showAllElements();
        System.out.println("-----------------------");



        System.out.println("The 11th element of the first array equals to: " + clt1.getValue(10));
        System.out.println();
        System.out.print("Try to get element with index = -1 from 1st array. ");
        clt1.getValue(-1);

        System.out.println("-----------------------");
        System.out.println("Compare 1st array with 2nd");
        clt1.compare(clt2);
        clt1.clear();
        System.out.println("Clear 1st array and compare it to 2nd again.");
        clt1.compare(clt2);
        System.out.println("Compare 1st and 3rd arrays.");
        clt1.compare(clt3);
        System.out.println("-----------------------");
    }
}
