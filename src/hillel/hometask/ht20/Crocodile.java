package hillel.hometask.ht20;

public class Crocodile extends WildAnimal{

    public Crocodile(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void eat() {
        System.out.println("Eat fish and other animals. ");
    }

    @Override
    public void move() {
        System.out.println("Swim in the water.");
    }
}
