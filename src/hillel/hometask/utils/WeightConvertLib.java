package hillel.hometask.utils;

import java.util.Scanner;

public class WeightConvertLib {

    private static Scanner in = new Scanner(System.in);
    private static String s;
    private static double weight;

    private static int getMega(double weight) {
        return (int) (weight / 1000000);

    }

    private static int getKilo(double weight) {
        return (int) ((weight / 1000) - getMega(weight) * 1000);
    }

    private static int getDeca(double weight) {
        return (int) weight % 1000;
    }

    private static long getMilli(String weight) {
        String[] parts = String.valueOf(weight).split("[.]");
        long milli = 0;
        if (parts.length > 1) {
            milli = Long.valueOf(parts[1]);
        }
        return milli;
    }

    public static void caseGrams() {
        System.out.println("Enter weight in grams: ");
        s = in.nextLine();
        weight = Double.parseDouble(s);

        if (getMega(weight) != 0) {
            System.out.print(getMega(weight) + "tons ");
        }
        if (getKilo(weight) != 0) {
            System.out.print(getKilo(weight) + "kilograms ");
        }
        if (getDeca(weight) != 0) {
            System.out.print(getDeca(weight) + "grams ");
        }
        if (getMilli(s) != 0) {
            System.out.print(getMilli(s) + "micrograms");
        }

    }

    public static void caseKilograms() {
        System.out.println("Enter weight in kilograms: ");
        s = in.nextLine();
        weight = Double.parseDouble(s);
        if (getMega(weight) != 0) {
            System.out.print(getMega(weight) + "kilotons ");
        }
        if (getKilo(weight) != 0) {
            System.out.print(getKilo(weight) + "tons ");
        }
        if (getDeca(weight) != 0) {
            System.out.print(getDeca(weight) + "kilograms ");
        }
        if (getMilli(s) != 0) {
            System.out.print(getMilli(s) + "grams");
        }
    }

    public static void caseTons() {
        System.out.println("Enter weight in tons: ");
        s = in.nextLine();
        weight = Double.parseDouble(s);

        if (getMega(weight) != 0) {
            System.out.print(getMega(weight) + "megatons ");
        }

        if (getKilo(weight) != 0) {
            System.out.print(getKilo(weight) + "kilotons ");
        }
        if (getDeca(weight) != 0) {
            System.out.print(getDeca(weight) + "tons ");
        }

        if (getMilli(s) != 0) {
            System.out.print(getMilli(s) + "kilograms");
        }
    }
}
