/*
0. Новое требование от заказчика калькулятора - переделать калькулятор, чтобы при неправильном вводе чисел программа запрашивала
число заново и пользователь вводил операцию (+-* /)
*/

package hillel.hometask.zero;


import hillel.hometask.utils.CalcLib;
import hillel.hometask.utils.Input;

public class CalculatorMain {

    public static void main(String[] args) {

        try {

            String operation="";
            double op1=0, op2=0;

            op1 = Input.operandInput("first");
            op2 = Input.operandInput("second");
            operation = Input.operationInput(operation);

            switch (operation) {
                case "+": {
                    System.out.println("Result of addition is: " + CalcLib.addValues(op1, op2));
                    break;
                }
                case "-":
                    System.out.println("Result of subtraction: " + CalcLib.subValues(op1, op2));
                    break;
                case "*":
                    System.out.println("Result of multiplication: " + CalcLib.mulValues(op1, op2));
                    break;
                case "/":
                    if (!CalcLib.divisionByZero(op1, op2))
                        System.out.println("Result of division operation is: " + CalcLib.divValues(op1, op2));
                    break;
                case "%":
                    if (!CalcLib.divisionByZero(op1, op2))
                        System.out.println("Result of mod operation is: " + CalcLib.modValues(op1, op2));
                    break;
            }

        } catch (Exception e) {
            System.err.println("Invalid entered data. Try to enter decimal values as operands and use +, -, *, /, % for operation.");
        }
    }


}
