/*
5. Ввести число, определить четное или нет.
*/

package hillel.hometask.ht05;

import hillel.hometask.utils.InputLib;

public class EvenNumberMainClass {

    public static void main(String[] args) {

        int n = InputLib.inputIntValue("Enter any int number: ");

        //check
        if (n % 2 == 0)
            System.out.print("Number " + n + " is even");
        else
            System.out.print("Number " + n + " is not even");
    }

}
