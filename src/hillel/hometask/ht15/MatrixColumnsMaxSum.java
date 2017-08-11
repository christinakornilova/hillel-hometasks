/*
15. Найти столбец матрицы с максимальной суммой элементов:
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */

package hillel.hometask.ht15;

import java.util.Arrays;

import hillel.hometask.utils.ArrayLib;

public class MatrixColumnsMaxSum {

    public static void main(String[] args) {
        System.out.println("Please enter array dimensions (only positive decimal numbers):");
        int arrRowsCount = ArrayLib.inputDimension("Rows ");
        int arrColumnsCount = ArrayLib.inputDimension("Columns ");
        int[][] arr = new int[arrRowsCount][arrColumnsCount];
        int[] sumArr = new int[arrColumnsCount];

        arr = ArrayLib.createArray(arr, arrRowsCount, arrColumnsCount);

        //get sum
        for (int j = 0; j < arrColumnsCount; j++) {
            sumArr[j] = ArrayLib.getArrayColumnsSum(arr, j, arrRowsCount);
        }
        System.out.println("Array columns totals are: " + Arrays.toString(sumArr));
        System.out.println("Array columns max sum : " + ArrayLib.getArrayMaxColumnSum(sumArr));
    }
}
