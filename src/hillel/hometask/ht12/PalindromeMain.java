/*
12. Определить является ли число палиндромом
    (123456 - нет)(123321 - да)
    (9239329 - да)
*/

package hillel.hometask.ht12;

import java.util.Scanner;
import java.util.Arrays;

import hillel.hometask.utils.ArrayLib;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Enter number that you want to check:");
        s = in.next();

        char[] p1 = s.toCharArray();
        char[] p2 = ArrayLib.reverseArray(p1);
        System.out.println("Direct number: ");
        ArrayLib.arrayOut(p1);
        System.out.println("Reversed number: ");
        ArrayLib.arrayOut(p2);
        System.out.println();

        if ((Arrays.toString(p1)).equals(Arrays.toString(p2))) {
            System.out.println("Entered number is palindrome");
        } else {
            System.out.println("Entered number is not palindrome");
        }
    }
}
