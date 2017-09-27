package hillel.hometask.ht21;

public class Perfume implements Comparable{
    private String designer;//TM
    private String name;//frag name
    private int year;//production year
    private Type type;//edp, edt, edc, perfume
    private String group;//is in group
    private Gender gender;// m/f/u
    private String collection;//if exists
    private int volume;//in ml
    private double price;//in $

    Perfume(String mark, String name, int year, Type type, String group, Gender gender, String collection, int volume, double price) {
        this.designer = mark;
        this.name = name;
        this.year = year;
        this.type = type;
        this.group = group;
        this.gender = gender;
        this.collection = collection;
        this.volume = volume;
        this.price = price;
    }

    Perfume(){

    }

    @Override
    public int compareTo(Object main){
        if (!(main instanceof Perfume)) {
            System.exit(-1);
        }
        Perfume scent = (Perfume) main;
        return designer.compareToIgnoreCase(scent.designer);
    }

    static Perfume copyPerfume(Perfume scent) {
        Perfume newScent = new Perfume();
        newScent.designer = scent.designer;
        newScent.name = scent.name;
        newScent.year = scent.year;
        newScent.type = scent.type;
        newScent.group = scent.group;
        newScent.gender = scent.gender;
        newScent.collection = scent.collection;
        newScent.volume = scent.volume;
        newScent.price = scent.price;
        return newScent;
    }


    @Override
    public String toString() {
        return designer + " - " + name + " " + collection + " " + year +" " + gender + " " +  " $"+ price;
    }

    public boolean equals(Perfume scent) {
        return name.equalsIgnoreCase(scent.name) && designer.equalsIgnoreCase(scent.designer) && type == scent.type
                && gender == scent.gender && year == scent.year;
    }
}
