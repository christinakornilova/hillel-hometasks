/*
6. Ввести число, определить простое ли оно.
*/

package hillel.hometask.ht06;

import hillel.hometask.utils.InputLib;

public class PrimesMainClass {

    private static boolean isPrime(long n) {

        if (n == 1) // 1 is not prime
            return false;
        for (int i = 2; i <= (n / 2); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = InputLib.inputPositiveIntValue("Enter any positive int number: ");

        if (isPrime(n))
            System.out.println(n + " is prime number");
        else System.out.println(n + " is not prime number");

    }

}
