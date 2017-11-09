package hillel.hometask.ht27;

/*
Создайте десять Person с разными именами возрастом от 18 до 65 лет.
Добавьте их в List<Person> (реализация List: arrayList или LinkedList)
Напишите два метода showMiddleAgePerson и showPersonStartsNameWithA:
void showMiddleAgePerson(List<Person> list)
void showPersonStartsNameWithA(Stream<Person> stream)

В первом методе необходимо отобрать всех person с возрастом
25 < age < 45 и вывести в консоль (System.out) этих person.

Во 2 методе отобрать всех персон имена которых начинаются на букву “A” и
вывести их в консоль(System.out).
Задание необходимо выполнить с использованием Stream API и лямбда функций.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class MainTest {
    public static void main(String[] args) {
        String s[] = {"Dean","Sam","John","Anna","Ash","Uriel","Bobby","Ruby","Michael","Amy"};

        int minAge = 18;
        int maxAge = 65;

        List<Person> personsList = createPersonsList(s, minAge, maxAge);
        Stream<Person> personStream = personsList.stream();

        System.out.println("---------------------------------------");
        System.out.println("Show all persons: ");
        System.out.println("---------------------------------------");
        showPersonsUsingStream(personsList);
        System.out.println("---------------------------------------");

        System.out.println("All persons start with 'A':");
        System.out.println("---------------------------------------");
        showPersonStartsNameWithA(personStream);
        System.out.println("---------------------------------------");

        System.out.println("All persons with age '25 < age < 45': ");
        System.out.println("---------------------------------------");
        showMiddleAgePerson(personsList);
        System.out.println("---------------------------------------");
    }

    private static List<Person> createPersonsList(String s[], int minAge, int maxAge){
        List<Person> list = new ArrayList<>();
        for (int i=0;i<s.length;i++) {
            Person p = new Person(s[i], ThreadLocalRandom.current().nextInt(minAge, maxAge + 1));
            list.add(p);
        }
        return list;
    }

    private static void showMiddleAgePerson(List<Person> list){
        list.stream()
                .filter(p -> p.getAge() > 25)
                .filter(p -> p.getAge() < 45)
                .forEach(System.out::println);

    }

    private static void showPersonStartsNameWithA(Stream<Person> stream){
        stream
                .filter(p -> p.getName().startsWith("A"))
                .forEach(System.out::println);
    }

    private static void showPersonsUsingStream(List<Person> list){
        list.stream()
                .forEach(System.out::println);
    }
}
