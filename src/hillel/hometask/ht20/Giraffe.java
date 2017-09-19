package hillel.hometask.ht20;

public class Giraffe extends WildAnimal{
    public Giraffe(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void eat() {
        System.out.print("Eat grass. ");
    }

    @Override
    public void move() {
        System.out.println("Move very slowly.");
    }
}
