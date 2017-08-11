/*
11. Парсинг и вывод данных в консоль. Пользователь вводит массу в граммах вывести массу в соответствующих единицах измерения. Число может быть дробным.
    Пример:
    Ввод 123456789 -> Вывод 123 tons 456 kilograms 789 grams
    Пример:
    Ввод 123456.789 -> Вывод 123 kilograms 456 grams 789 micrograms
         2a. Пользователь вводит число, нужно запросить единицы измерения и вывести данные о массе.
    Ввод 123456
    Ввод kg
    Вывод 123 tons 456 kilograms 0 grams
         2b. Пропуск не значащих чисел
    Ввод 123000456
    Ввод g
    Вывод 123 tons 456 grams
*/

package hillel.hometask.ht11;

import java.util.Scanner;

import hillel.hometask.utils.WeightConvertLib;

public class ParsingMainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        double weight;

        try {
            do {
                System.out.println("Enter weight measure (g for grams, kg for kilograms, t for tons)");
                s = in.nextLine();
            } while (!s.equalsIgnoreCase("g") && !s.equalsIgnoreCase("kg") && !s.equalsIgnoreCase("t"));


            switch (s.toLowerCase()) {
                case "g": {
                    WeightConvertLib.caseGrams();
                    break;
                }
                case "kg": {
                    WeightConvertLib.caseKilograms();
                    break;
                }
                case "t": {
                    WeightConvertLib.caseTons();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect data. Please, try to enter positive decimal number.");
        }
    }

}
