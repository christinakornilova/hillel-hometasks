/*
2. Программа, которая находит среднее арифметическое значение произвольного количества чисел.
*/

package hillel.hometask.ht02;

import java.util.Scanner;
import hillel.hometask.utils.CalcLib;

public class AverageMainClass {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int count;
            double sum = 0;

            System.out.println("Enter values, only numbers accepted. To complete entering please type any symbol and press Enter. ");
            for (count = 0; scan.hasNextDouble(); count++) {
                sum = sum + scan.nextDouble();
            }
            System.out.println("Result: " + CalcLib.roundResult(sum / count));
        } catch (Exception e) {System.err.println("Incorrect entered data.");
        }

    }
}
