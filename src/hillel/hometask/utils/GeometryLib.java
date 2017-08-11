package hillel.hometask.utils;

public class GeometryLib {

    private static boolean inRectangle(int i, int j, int n, int m) {
        return i == 0 || i == n - 1 || j == 0 || j == m - 1;
    }

    public static boolean inRectangle(double[] z, double[] x, double[] y) {
        if (z[0] >= x[0] && z[0] <= y[0] && z[1] >= y[1] && z[1] <= x[1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void drawRectangle(int width, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (inRectangle(i, j, length, width)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawEnvelope(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i == j || j == n - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void drawChess(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                if ((i + j) % 2 != 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            System.out.println();
        }
    }


}
