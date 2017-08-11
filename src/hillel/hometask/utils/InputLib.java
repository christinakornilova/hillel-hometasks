package hillel.hometask.utils;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputLib {

    private static Scanner in = new Scanner(System.in);

    public static double operandInput(String number) {
        String s1;

        do {
            System.out.println("InputLib " + number + " operand (only decimal): ");
            s1 = in.next();
        } while (!CalcLib.isInt(s1) && !CalcLib.isDouble(s1));
        return Double.parseDouble(s1);
    }

    public static String operationInput(String operation) {
        System.out.println(operation);
        operation = in.next();
        return operation;

    }

    public static BigDecimal inputBigDecValue(String s) {
        String value;
        do {
            System.out.println(s);
            value = in.nextLine();
        } while (!CalcLib.isInt(value) && !CalcLib.isDouble(value));
        return new BigDecimal(value);
    }

    public static double inputDoubleValue(String s) {
        String doubleValue;
        do {
            System.out.println(s);
            doubleValue = in.nextLine();
        } while (!CalcLib.isInt(doubleValue) && !CalcLib.isDouble(doubleValue));
        return Double.parseDouble(doubleValue);
    }

    public static int inputIntValue(String s) {
        String intValue;
        do {
            System.out.println(s);
            intValue = in.nextLine();
        } while (!CalcLib.isInt(intValue));
        return Integer.parseInt(intValue);
    }

    public static int inputPositiveIntValue(String s) {
        String posIntValue;
        do {
            System.out.println(s);
            posIntValue = in.next();
        } while (!CalcLib.isInt(posIntValue) || !CalcLib.isPositive(posIntValue));
        if (CalcLib.isInt(posIntValue)) {
            int i = Integer.parseInt(posIntValue);
        }
        return Integer.parseInt(posIntValue);
    }

}
