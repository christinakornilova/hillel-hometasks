package hillel.hometask.ht20;

public class GuideDog extends Dog{
    private boolean isTrained;

    public GuideDog(boolean isVaccinated, boolean isTrained, String name) {
        this.setName(name);
        this.setVaccinated(isVaccinated);
        this.isTrained = isTrained;
    }


    @Override
    public void voice() {
        String speech = "Hello";

        if (!this.getName().equals("")){
            speech = speech.concat(", my name is " + this.getName() + ".");
        } else {
            speech = speech.concat(".");
        }
        System.out.println(speech);

        if (this.isTrained){
            System.out.println("I can take you home.");
        }
    }

    public void takeHome(){
        System.out.println("Come with me.");
    }

}
