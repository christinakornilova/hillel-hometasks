/*
7. Ввести число, определить каким числам оно кратно.
*/

package hillel.hometask.ht07;

import hillel.hometask.utils.InputLib;

public class MultiplicityMainClass {
    public static void main(String[] args) {

        try {
            int a = InputLib.inputPositiveIntValue("Please enter number (positive int value only): ");
            System.out.print("The number  " + a + " dividers are: ");
            for (int i = a; i > 0; i--) {
                int b = a % i;
                if (b == 0)
                    System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.err.println("Incorrect data.");
        }

    }


}
