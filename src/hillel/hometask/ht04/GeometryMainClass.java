/*
4. Вывести на консоль графику (ширину и высоту задает пользователь) вида:
а. Обычный прямоугольник
б. Конверт
в. В шахматном порядке
*/

package hillel.hometask.ht04;

import java.util.Scanner;

import hillel.hometask.utils.GeometryLib;
import hillel.hometask.utils.InputLib;

public class GeometryMainClass {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s;

        try {
            do {
                System.out.println("Enter what do you want to draw. 1 - for rectangle, 2 - for envelope, 3 - for chess desk (int values, > 0): ");
                s = in.next();
            } while (!s.equals("1") && !s.equals("2") && !s.equals("3"));

            //what to draw
            switch (s) {
                case "1": {
                    int width = InputLib.inputPositiveIntValue("Enter width of the rectangle (int value, > 0): ");
                    int length = InputLib.inputPositiveIntValue("Enter length of the rectangle (int value, > 0): ");
                    GeometryLib.drawRectangle(width, length);
                    break;
                }
                case "2": {
                    int n = InputLib.inputPositiveIntValue("Enter envelope side length/width (int value, > 0): ");
                    GeometryLib.drawEnvelope(n);
                    break;
                }
                case "3": {
                    int rows = InputLib.inputPositiveIntValue("Enter width of the 'chess desk' (int value, > 0): ");
                    int cols = InputLib.inputPositiveIntValue("Enter length of the 'chess desk' (int value, > 0): ");
                    GeometryLib.drawChess(rows, cols);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect data.");
        }

    }

}
