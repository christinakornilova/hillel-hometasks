package hillel.hometask.utils;

import java.util.Scanner;

public class Input {

    private static Scanner in = new Scanner(System.in);

    public static double operandInput(String number){
        String s1;

        do {
            System.out.println("Input " + number + " operand (only decimal): ");
            s1 = in.next();
        } while (!CalcLib.isInt(s1) && !CalcLib.isDouble(s1));
        double operand = Double.parseDouble(s1);
        return operand;
    }

    public static String operationInput(String operation){
        System.out.println("Input operation (+, -, *, /, %):");
        operation = in.next();
        return operation;

    }

}
