package hillel.hometask.ht20;

public class Lion extends WildAnimal{
    public Lion(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" Roar! ");
    }

    @Override
    public void move() {
        System.out.println("Move like a king. ");
    }

    @Override
    public void eat() {
        System.out.println("Eat a lot of meat. ");
    }
}
