/*
14. В числовой матрице поменять местами два столбца, т. е. все элементы одного столбца поставить на соответствующие
им позиции другого, а его элементы второго переместить в первый.
*/

package hillel.hometask.ht14;

import static hillel.hometask.utils.ArrayLib.*;

public class MatrixSwapColumns {

    public static void main(String[] args) {
        System.out.println("Please enter array dimensions.");
        int arrRowsCount = inputDimension("Rows ");
        int arrColumnsCount = inputDimension("Columns ");
        int[][] arr = new int[arrRowsCount][arrColumnsCount];

        arr = createArray(arr, arrRowsCount, arrColumnsCount);

        //swap columns
        System.out.println();
        arr = swapArrayColumns(arr, arrRowsCount, arrColumnsCount);
        System.out.println("Array with swapped columns: ");
        arrayOut(arr, arrRowsCount, arrColumnsCount);
    }
}
