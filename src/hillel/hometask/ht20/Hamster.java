package hillel.hometask.ht20;

public class Hamster extends DomesticAnimal{

    public Hamster(String name) {
        this.setName(name);
    }

    @Override
    public void move() {
        System.out.println("Run in a wheel. ");
    }

    @Override
    public void breath() {
        System.out.println("Breath fast. ");
    }

    @Override
    public void eat() {
        System.out.println("Eat grass and wheat. ");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Eek!");
    }
}