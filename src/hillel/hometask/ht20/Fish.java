package hillel.hometask.ht20;

public class Fish extends DomesticAnimal{
    public Fish(String name) {
        this.setName(name);
    }

    @Override
    public void breath() {
        System.out.print("You can see how I'm breathing. ");
    }

    @Override
    public void eat() {
        System.out.print("I usually eat dry fish food. ");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("And all I can say is '...' :)");
    }

    @Override
    public void move() {
        System.out.println("And often swim in the aquarium.");
    }
}
