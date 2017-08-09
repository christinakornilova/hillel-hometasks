/*
14. В числовой матрице поменять местами два столбца, т. е. все элементы одного столбца поставить на соответствующие
им позиции другого, а его элементы второго переместить в первый.
*/

package hillel.hometask.fourteen;

import java.util.Arrays;
import java.util.Scanner;
import static hillel.hometask.utils.CalcLib.*;

public class MatrixSwapColumns {


    static int inputDimension(String s1) {
        int dimension;
        Scanner in = new Scanner(System.in);
        String s;
        do {
            System.out.println(s1 + " count will be: ");
            s = in.nextLine();
        } while (!isInt(s));
        dimension = Integer.parseInt(s);
        return dimension;
    }

    static int[][] arrayCreation(int[][] array, int rowsCount, int columnsCount) {

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

    static int inputColumnsToSwap(String column, int columnsCount) {
        Scanner in = new Scanner(System.in);
        String s;
        do {
            System.out.println(column);
            s = in.nextLine();
        } while (!isInt(s) || Integer.parseInt(s) < 0 || Integer.parseInt(s) >= columnsCount);

        return Integer.parseInt(s);
    }

    static int[][] swapArrayColumns(int[][] array, int rowsCount, int columnsCount) {

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

    static void arrayOut(int[][] array, int rowsCount, int columnsCount) {
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Returns sum of array columns
    static int getArrayColumnsSum(int[][] arr, int j, int rowsCount) {
        int sum = 0;
        for (int i = 0; i < rowsCount; i++) {
            sum = sum + arr[i][j];
        }
        return sum;
    }

    //Returns max sum of array columns
    static int getArrayMaxColumnSum(int[] sumArray) {
        int maxSum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            if (maxSum < sumArray[i]) {
                maxSum = sumArray[i];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Please enter array dimensions.");
        int arrRowsCount = inputDimension("Rows ");
        int arrColumnsCount = inputDimension("Columns ");
        int[][] arr = new int[arrRowsCount][arrColumnsCount];
        int[] sumArr = new int[arrColumnsCount];

        arr = arrayCreation(arr, arrRowsCount, arrColumnsCount);

        //get sum
        for (int j = 0; j < arrColumnsCount; j++) {
            sumArr[j] = getArrayColumnsSum(arr, j, arrRowsCount);
        }
        System.out.println("Array columns sums are: " + Arrays.toString(sumArr));
        System.out.println("Array max sum columns: " + getArrayMaxColumnSum(sumArr));

        //swap columns
        System.out.println();
        arr = swapArrayColumns(arr, arrRowsCount, arrColumnsCount);
        System.out.println("Array with swapped columns: ");
        arrayOut(arr, arrRowsCount, arrColumnsCount);
    }
}
