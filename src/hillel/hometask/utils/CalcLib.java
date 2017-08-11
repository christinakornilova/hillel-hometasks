package hillel.hometask.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class CalcLib {

    public static boolean isInt(String x) throws NumberFormatException
    {
        try {
            Integer.parseInt(x);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static boolean isDouble(String x) throws NumberFormatException {
        try {
            Double.parseDouble(x);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isPositive(String x)
    {
        try {
            return (Integer.parseInt(x) > 0);
        } catch(Exception e) {
            return false;
        }
    }

    public static double roundResult (double d) {
        return new BigDecimal(d).setScale(4, RoundingMode.HALF_UP).doubleValue();
    }

    public static boolean divisionByZero(double a, double b){
        if (b == 0) {
            System.out.println("Division by zero!");
            return true;
        } else {
            return false;
        }
    }

    public static double addValues(double a, double b){
        return  CalcLib.roundResult(a + b);
    }

    public static double subValues (double a, double b){
        return CalcLib.roundResult(a - b);
    }

    public static double mulValues(double a, double b){
        return CalcLib.roundResult(a * b);
    }

    public static double divValues(double a, double b){
        return CalcLib.roundResult(a / b);
    }

    public static double modValues(double a, double b){
        return CalcLib.roundResult(a % b);
    }

}
