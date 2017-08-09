/*
1. Программа, которая находит среднее арифметическое значение двух чисел.
2. Программа, которая находит среднее арифметическое значение произвольного количества чисел.
 */

package hillel.hometask.one;

import hillel.hometask.utils.CalcLib;
import hillel.hometask.utils.Input;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        double op1, op2, avg;

        int count;
        double sum = 0;

        System.out.println("Average value. Enter number of values: ");
        s = in.nextLine();

        if (s.equalsIgnoreCase("1")) {
            op1 = Input.operandInput("the");
            avg = CalcLib.roundResult(op1);
            System.out.println("Average value is " + avg);
        } else if (s.equalsIgnoreCase("2")) {
            op1 = Input.operandInput("first");
            op2 = Input.operandInput("second");
            avg = CalcLib.roundResult((op1 + op2) / 2);
            System.out.println("Average of " + op1 + " and " + op2 + " is " + avg);
        } else if (s.equalsIgnoreCase("0")) {
            System.out.println("Division by zero. Values count can not be 0.");
        } else {
            System.out.println("Enter values, only numbers accepted. To complete entering please type any symbol and press Enter. ");
            for (count = 0; in.hasNextDouble(); count++) {
                sum = sum + in.nextDouble();
            }
            avg = CalcLib.roundResult(sum / count);
            System.out.println("Result: " + avg);
        }
    }

}
