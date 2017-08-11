/*
3. Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых, которые выплачивает банк,
длительность вклада (лет).
Вывести накопленную сумму денег за каждый год и начисленные проценты.
*/

package hillel.hometask.ht03;

import java.math.BigDecimal;
import java.util.Scanner;

import hillel.hometask.utils.InputLib;

public class BankCalcMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        BigDecimal i, dep, percentVal, percentValTotal = new BigDecimal("0");
        int year, j1;
        double percent;

        try {
            dep = InputLib.inputBigDecValue("Enter deposit value in UAH");
            percent = InputLib.inputDoubleValue("Enter % per year: ");
            year = InputLib.inputIntValue("Enter deposit term in years: ");


            for (int j = 0; year > 0; j++) {
                i = BigDecimal.valueOf(percent);
                percentVal = (dep.multiply(i)).divide(BigDecimal.valueOf(100), 4);
                percentValTotal = percentValTotal.add(percentVal);
                dep = dep.add((dep.multiply(i)).divide(BigDecimal.valueOf(100), 4));
                j1 = j + 1;
                year = year - 1;
                System.out.println("For the " + j1 + " year you deposit value will be " + dep.setScale(2, BigDecimal.ROUND_HALF_UP).toString()
                        + " UAH" + ", percents value per year will be " + percentVal.setScale(2, BigDecimal.ROUND_HALF_UP).toString() + " UAH"
                        + ", percents value total will be " + percentValTotal.setScale(2, BigDecimal.ROUND_HALF_UP) + " UAH.");
            }


        } catch (Exception e) {
            System.err.println("Incorrect entered data.");
        }
    }
}
