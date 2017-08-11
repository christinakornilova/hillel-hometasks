/*
13. Двумерный массив 10х10, заполнить случайными числами от -20 до 20. Реализовать функцию:
    определения суммы элементов массива,
    среднее арифметическое,
    минимальный элемент,
    максимальный элемент,
    число положительных элементов
    сумму по строкам.
*/

package hillel.hometask.ht13;

import hillel.hometask.utils.ArrayLib;

public class RandomArrayMain {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        ArrayLib.createRandArray(array);
        System.out.println("Array sum is: " + String.format("%.0f", ArrayLib.getArraySum(array)));
        System.out.println();
        System.out.println("Average of array elements is: " + String.format("%.2f", ArrayLib.getArrayAvg(array)));
        System.out.println();
        System.out.println("Array minimum element is: " + ArrayLib.getArrayMin(array));
        System.out.println();
        System.out.println("Array maximum element is: " + ArrayLib.getArrayMax(array));
        System.out.println();
        System.out.println("Array positives count is: " + ArrayLib.getArrPosCount(array));
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            System.out.println("Array column " + j + " sum is: " + ArrayLib.getArraySumColumns(array, j));
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array row " + i + " sum is: " + ArrayLib.getArraySumRows(array, i));
        }

    }

}
