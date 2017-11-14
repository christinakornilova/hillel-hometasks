package hillel.hometask.ht17;

import hillel.hometask.utils.ArrayLib;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dimension = ThreadLocalRandom.current().nextInt(1, 21);
        int arr[] = new int[dimension];
        arr = ArrayLib.createRandomArray(arr, 100);
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] array = ArrayLib.doInsertionSort(arr);
        System.out.println("Sorted array" + Arrays.toString(array));

        try {
            System.out.println("Enter element that you want to find:");
            int x = in.nextInt();
            int index;
            index = ArrayLib.doRecursiveBinSearch(array, 0, array.length-1, x);
            if (index >= 0) {
                System.out.println("Element index (starting from 0) is : " + index);
            } else System.out.println("Array contains no such element.");
        } catch (Exception e) {
            System.out.println("Wrong entered data.");
        }
    }
}
