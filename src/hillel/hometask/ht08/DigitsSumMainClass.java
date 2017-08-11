/*
8. Реализовать функцию по нахождению сумм цифр в числе без использования класса String или массивов типа char (123->6, 202->4).
*/

package hillel.hometask.ht08;

import hillel.hometask.utils.InputLib;

public class DigitsSumMainClass {
    public static void main(String[] args) {
        int x = InputLib.inputPositiveIntValue("Enter int value (only positive values accepted):");
        String s = ""+x;
        int sum = 0;
        try {
            while (x != 0) {
                sum = sum + x % 10;
                x = x / 10;
            }
            System.out.println("Digits sum of " + s + " is " + sum);
        } catch (Exception e) {
            System.err.println("Invalid entered data.");
        }
    }

}
