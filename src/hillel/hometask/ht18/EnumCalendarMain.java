/*
18. Написать функцию, которая принимает в качестве параметров месяц и год и выводит, сколько дней в этом месяце.
	Для ввода месяца и года используйте числовые значения
(например, январь - 1 месяц, март - 3 и т.д.)
Для названия месяцев и вывода информации используйте enum. Например,
“January 1981 and 31 days” или “February 2016 and 29 days”.
 */

package hillel.hometask.ht18;

import hillel.hometask.utils.InputLib;

public class EnumCalendarMain {

    public static void main(String[] args) {
        int month = InputLib.inputPositiveIntValueInterval("Enter month number from 1 to 12: ", 1, 12);
        int year = InputLib.inputPositiveIntValue("Input year:");

        switch (month){
            case 1: {
                System.out.println(Calendar.One.getMonth() + " " + year + " and 31 days");
                break;
            }
            case 2: {
                System.out.print(Calendar.Two.getMonth());
                if (year%4 == 0){
                    System.out.print(" "  + year + " and 29 days");
                } else System.out.print(" "  + year + " and 28 days");
                break;
            }
            case 3: {
                System.out.println(Calendar.Three.getMonth() + " "  + year + " and 31 days");
                break;
            }
            case 4: {
                System.out.println(Calendar.Four.getMonth() + " "  + year + " and 30 days");
                break;
            }
            case 5: {
                System.out.println(Calendar.Five.getMonth() + " "  + year + " and 31 days");
                break;
            }
            case 6: {
                System.out.println(Calendar.Six.getMonth() + " "  + year + " and 30 days");
                break;
            }
            case 7: {
                System.out.println(Calendar.Seven.getMonth() + " "  + year + " and 31 days");
                break;
            }
            case 8: {
                System.out.println(Calendar.Eight.getMonth() + " "  + year + " and 31 days");
                break;
            }
            case 9: {
                System.out.println(Calendar.Nine.getMonth() + " "  + year + " and 30 days");
                break;
            }
            case 10: {
                System.out.println(Calendar.Ten.getMonth() + " "  + year + " and 31 days");
                break;
            }
            case 11: {
                System.out.println(Calendar.Eleven.getMonth() + " "  + year + " and 30 days");
                break;
            }
            case 12: {
                System.out.println(Calendar.Twelve.getMonth() + " "  + year + " and 31 days");
                break;
            }
        }

    }
}
