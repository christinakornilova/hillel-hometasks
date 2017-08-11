/*
9. Пользователь вводит координаты верхнего левого и нижнего правого угла прямоугольника, а также координаты точки (X,Y)
в прямоугольной системе координат. Реализовать функцию, которая определяет принадлежит ли точка этому прямоугольнику.
*/

package hillel.hometask.ht09;

import hillel.hometask.utils.GeometryLib;
import hillel.hometask.utils.InputLib;

public class RectnglePointMainClass {

    public static void main(String[] args) {

        double[] x = {0, 0}, y = {0, 0}, z = {0, 0};

        try {
            System.out.println("");
            System.out.println("Specify the rectangle.");
            System.out.println("");
            x[0] = InputLib.inputDoubleValue("Input rectangle's top left apex coordinate x");
            y[0] = InputLib.inputDoubleValue("Input rectangle's top left apex coordinate y");
            x[1] = InputLib.inputDoubleValue("Input rectangle's bottom right apex coordinate x");
            y[1] = InputLib.inputDoubleValue("Input rectangle's bottom right apex coordinate y");

            System.out.println("");
            System.out.println("Specify point that you want to check.");
            System.out.println("");
            z[0] = InputLib.inputDoubleValue("Input point's coordinate x");
            z[1] = InputLib.inputDoubleValue("Input point's coordinate y");


            if (GeometryLib.inRectangle(z, x, y)) {
                System.out.println("The point ("+z[0]+","+z[1]+") appertains to rectangle");
            } else {
                System.out.println("The point ("+z[0]+","+z[1]+") does not appertain to rectangle");
            }
        }catch (Exception e){
            System.out.println("Incorrect data.");
        }
    }
}
