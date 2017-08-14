package hillel.hometask.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class ArrayLib {

    public static int inputDimension(String s1) {
        int dimension;
        Scanner in = new Scanner(System.in);
        String s;
        do {
            System.out.println(s1 + " count will be: ");
            s = in.nextLine();
        } while (!CalcLib.isInt(s) || !CalcLib.isPositive(s));
        dimension = Integer.parseInt(s);
        return dimension;
    }

    public static int[][] createArray(int[][] array, int rowsCount, int columnsCount) {

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                array[i][j] = (int) (101 * Math.random());
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        return array;
    }

    //Random filed with int from -20 to 20 numbers array creation
    public static void createRandArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (-21 + (20 + 20 + 1) * Math.random());
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    public static int[] createRandomArray(int[] array, int value) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-value + 1 + (value+value +1) * Math.random());
        }
        return array;
    }


    private static int inputColumnsToSwap(String column, int columnsCount) {
        Scanner in = new Scanner(System.in);
        String s;
        do {
            System.out.println(column);
            s = in.nextLine();
        } while (!CalcLib.isInt(s) || Integer.parseInt(s) < 0 || Integer.parseInt(s) >= columnsCount);

        return Integer.parseInt(s);
    }

    public static int[][] swapArrayColumns(int[][] array, int rowsCount, int columnsCount) {

        int col1, col2, b;

        System.out.println("What columns do you want to swap? Please select values between 0 and " + (columnsCount - 1));

        col1 = inputColumnsToSwap("First one: ", columnsCount);
        col2 = inputColumnsToSwap("Second one: ", columnsCount);

        for (int i = 0; i < rowsCount; i++) {
            b = array[i][col1];
            array[i][col1] = array[i][col2];
            array[i][col2] = b;
        }
        return array;
    }

    public static void arrayOut(int[][] array, int rowsCount, int columnsCount) {
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void arrayOut(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void arrayOut(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    //Returns sum of array columns
    public static int getArrayColumnsSum(int[][] arr, int j, int rowsCount) {
        int sum = 0;
        for (int i = 0; i < rowsCount; i++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }

    //Returns max sum of array columns
    public static int getArrayMaxColumnSum(int[] sumArray) {
        int maxSum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if (maxSum < sumArray[i]) {
                maxSum = sumArray[i];
            }
        }
        return maxSum;
    }

    //Returns sum of all array elements
    public static double getArraySum(int[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

    //Returns smm of all array rows
    public static int getArraySumRows(int[][] arr, int i) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }

    //Returns sum of all array columns
    public static int getArraySumColumns(int[][] arr, int j) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }


    //Returns of avg of all array elements
    public static double getArrayAvg(int[][] arr) {
        return (getArraySum(arr)) / 100;
    }

    //Returns min array element
    public static int getArrayMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }

    //Returns max array element
    public static int getArrayMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    //Returns array positive elements count
    public static int getArrPosCount(int[][] arr) {
        int posCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 0)
                    posCount = posCount + 1;
            }
        }
        return posCount;
    }

    public static char[] reverseArray(char[] arr) {
        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[(arr.length - 1) - i] = arr[i];
        }
        return arr2;
    }

    public static int[] doBubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return array;
    }

    public static int[] doInsertionSort(int[] array) {
        int tmp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                tmp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && tmp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = tmp;
            }
        }
        return array;
    }

    public static int doBinarySearch(int[] array, int x) {
        int index = -1;
        if (array != null) {
            int first = 0, last = array.length, mid;
            while (first < last) {
                mid = (first + last) / 2;
                if (x == array[mid]) {
                    index = mid;
                    break;
                } else if (x < array[mid]) {
                    last = mid;
                } else {
                    first = mid + 1;
                }
            }
        }
        return index;
    }

    public static int doRecursiveBinSearch(int[] array, int first, int last, int x) {
        int index;
        if (first > last)
            index = -1;
        else {
            int mid = (first + last) / 2;
            if (x == array[mid])
                index = mid;
            else if (x < array[mid])
                index = doRecursiveBinSearch(array, first, mid - 1, x);
            else
                index = doRecursiveBinSearch(array, mid + 1, last, x);
        }
        return index;
    }
}
