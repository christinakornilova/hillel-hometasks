package hillel.hometask.ht20;

public class Cat extends DomesticAnimal{
    private String type;
    private String breed;

    public Cat(String name, String type, String breed, boolean Vaccinated) {
        this.setName(name);
        this.type = type;
        this.breed = breed;
        this.setVaccinated(Vaccinated);
    }

    @Override
    public void move() {
        System.out.println("Move carefully.");
    }

    @Override
    public void breath() {
        System.out.println("Breath silently.");
    }

    @Override
    public void eat() {
        System.out.println("Eat mice.");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Meow!");
    }

    public String getType(){
        return type;
    }

    public String getBreed(){
        return breed;
    }

    public void showBreed() {
        if (this.getBreed().equalsIgnoreCase("")) {
            System.out.println("I have no specified breed.");
        } else System.out.println("I am " + this.getBreed());
    }

    public void showType(){
        if (this.getType().equalsIgnoreCase("")){
            System.out.println("I have no specified type.");
        } else System.out.println("I am " + this.getType());

    }
}