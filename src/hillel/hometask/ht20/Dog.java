package hillel.hometask.ht20;

public class Dog extends DomesticAnimal{

    public Dog(String name) {

        this.setName(name);
    }

    public Dog() {
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Woof!");
    }

    @Override
    public void move() {
        System.out.println("I can run fast.");
    }

    @Override
    public void breath() {
        System.out.println("Breath noisy.");
    }

    @Override
    public void eat() {
        System.out.println("Eat dry food.");
    }

    public void trace(){
        System.out.println("And find any trace.");
    }
}
