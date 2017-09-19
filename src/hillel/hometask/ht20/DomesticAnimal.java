package hillel.hometask.ht20;

public abstract class DomesticAnimal extends Animal {
    private boolean isVaccinated;
    private String name;



    public DomesticAnimal(String name, boolean isVaccinated) {
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public DomesticAnimal(){

    }



    public void setVaccinated(boolean vaccinated) {
        this.isVaccinated = vaccinated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public void voice() {
        String speech = "Hello";

        if (!this.getName().equalsIgnoreCase("")){
            speech = speech.concat(", my name is " + this.getName() + ".");
        } else {
            speech = speech.concat(".");
        }
        System.out.println(speech);
    }
}
