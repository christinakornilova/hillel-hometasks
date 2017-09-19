package hillel.hometask.ht20;

public abstract class Animal {
    private int id;
    private byte age;
    private double weight;
    private String color;

    public abstract void voice();
    public abstract void move();
    public abstract void breath();
    public abstract void eat();


    public Animal() {
    }

    public void setId(int id) {
        this.id = id;
    }

    //in years
    public void setAge(byte age) {
        this.age = age;
    }

    //in kg
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showAllMetrics(){
        System.out.println("My color is " + this.color + ", my weight is " + this.weight + "kg. I am " + this.age + " years old.");
    }
}
