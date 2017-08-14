/*
16. Сформировать массив целочисленных чисел состоящий из n-элементов, где n<=20
Отсортировать его используя один из прямых алгоритмов сортировки (пузырьковая сортировка, сортировка методом вставок или сортировка выбором).
Реализовать поиск заданного элемента используя бинарный поиск.
 */

package hillel.hometask.ht16;

import hillel.hometask.utils.ArrayLib;
import hillel.hometask.utils.CalcLib;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchMain {

    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Please input array length (from 0 to 20): ");
            s = in.nextLine();
        } while (!CalcLib.isInt(s) || !CalcLib.isPositive(s) || !CalcLib.isLessThanEnteredValue(s, 20));

        int dimension = Integer.parseInt(s);
        int arr[] = new int[dimension];
        arr = ArrayLib.createRandomArray(arr, 100);
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] bubbleArray = ArrayLib.doBubbleSort(arr);
        System.out.println("Bubble sorted array is" + Arrays.toString(bubbleArray));
        int[] insertionArray = ArrayLib.doInsertionSort(arr);
        System.out.println("Array sorted via insertion sort" + Arrays.toString(insertionArray));

        try {
            System.out.println("Enter element that you want to find:");
            int x = in.nextInt();
            int indexRec, indexIt;
            indexIt = ArrayLib.doBinarySearch(bubbleArray, x);
            indexRec = ArrayLib.doRecursiveBinSearch(insertionArray, 0, insertionArray.length-1, x);
            if (indexIt >= 0 && indexRec >= 0) {
                System.out.println("Index of need element is (iteration): " + indexIt);
                System.out.println("Index of need element is (recursion): " + indexRec);
            } else System.out.println("Array contains no such element.");
        } catch (Exception e) {
            System.out.println("Wrong entered data.");
        }
    }

}
