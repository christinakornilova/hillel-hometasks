package hillel.hometask.ht21;

import static hillel.hometask.ht21.Gender.*;
import static hillel.hometask.ht21.Type.*;

public class Main {
    public static void main(String[] args) {
        MyPerfumesCollection pc1 = new MyPerfumesCollection();
        MyPerfumesCollection pc2 = new MyPerfumesCollection();
        MyPerfumesCollection pc3 = new MyPerfumesCollection();
        MyPerfumesCollection pc4 = new MyPerfumesCollection();

        Perfume scent1 = new Perfume("Dior", "Sauvage", 2015, EDP, "Fougere", M, "", 60,62.99);
        Perfume scent2 = new Perfume("Dior", "Dolce Vita", 1994, EDP, "Oriental Woody", F, "", 50,62.95);
        Perfume scent3 = new Perfume("Chanel", "Allure Sensuelle", 2005, EDP,
                "Oriental Floral", F, "", 200,85.00);
        Perfume scent4 = new Perfume("Hermes", "Sur Le Nil", 2005, EDP,
                "Floral Fruity", U, "Un Jardin", 30,58.95);
        Perfume scent5 = new Perfume("Hermes", "Apres La Mousson", 2008, EDP,
                "Woody Spicy", U, "Un Jardin", 30,58.95);
        Perfume scent6 = new Perfume("Guerlain", "Angelique Lilas", 2007, EDT,
                "Floral Green", F, "Aqua Allegoria", 75,50.88);
        Perfume scent7 = new Perfume("Guerlain", "Herba Fresca", 1999, EDT,
                "Aromatic Green", U, "Aqua Allegoria", 125,36.64);
        Perfume scent8 = new Perfume("Jo Malone", "Blackberry & Bay", 2012, EDC,
                "Floral Fruity", F, "London", 30,65.99);
        Perfume scent9 = new Perfume("Tom Ford", "White Suede", 2009, EDP,
                "Floral Woody Musk", F, "White Musk Collection", 50,230.00);
        Perfume scent10 = new Perfume("Creed", "Silver Mountain Water", 1995, EDT,
                "Aromatic", U, "", 100,85.00);

        pc1.add(scent1);
        pc1.add(scent2);
        pc1.add(scent3);
        pc1.add(scent4);
        pc1.add(scent5);
        pc2.add(scent6);
        pc2.add(scent7);
        pc2.add(scent8);
        pc2.add(scent9);
        pc3.add(scent10);

        System.out.println("--------------------------------");
        System.out.println("First collection:");
        pc1.showAll();
        System.out.println("--------------------------------");
        System.out.println("Second collection:");
        pc2.showAll();
        System.out.println("--------------------------------");
        System.out.println("Third collection:");
        pc3.showAll();
        System.out.println("--------------------------------");
        System.out.println("Remove all elements from 3rd collection.");
        pc3.removeAll();
        System.out.println("Get element from empty collection 3: " + pc3.getElement(0));
        System.out.println("Third collection has no elements: " + pc3.isEmpty());
        System.out.println("Second collection has no elements: " + pc2.isEmpty());
        System.out.println("--------------------------------");
        pc3.copy(pc1);
        System.out.println("Copy first collection elements to third one. Modified third collection:");
        pc3.showAll();
        System.out.println("--------------------------------");
        System.out.println("First collection equals third one " + pc3.equals(pc1));
        pc3.add(scent10);
        System.out.println("Add " + scent10.toString() + " to 3rd collection.");
        //pc3.showAll();
        System.out.println("Third collection contains all elements from first collection: " + pc3.containsAll(pc1));
        System.out.println("First collection contains all elements from third collection: " + pc1.containsAll(pc3));
        System.out.println("Second collection contains all elements from first collection: " + pc2.containsAll(pc1));
        System.out.println("--------------------------------");
        System.out.println("Second collection equals first one " + pc2.equals(pc1));
        System.out.println("--------------------------------");

        System.out.println("Fragrance: " +scent2.toString()+ " has index " + pc1.indexOf(scent2)+" in first collection.");
        System.out.println("First collection fifth added fragrance is " + pc1.getElement(4));
        System.out.println("--------------------------------");

        System.out.println("First collection has " + pc1.getSize() + " fragrances.");
        System.out.println("--------------------------------");

        System.out.println("Remove Dior Sauvage from third collection. Now collection contains: ");
        pc3.removeElement(scent1);
        pc3.showAll();
        System.out.println("--------------------------------");
        System.out.println("Add all elements from first and second collections into the fourth collection.");
        pc4.addAll(pc1);
        pc4.addAll(pc2);
        pc4.showAll();
        System.out.println("--------------------------------");

    }
}
