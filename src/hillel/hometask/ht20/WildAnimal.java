package hillel.hometask.ht20;

public abstract class WildAnimal extends Animal {
    private boolean isPredator;

    public WildAnimal(boolean isPredator) {
        this.isPredator = isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public void voice() {
        System.out.print("Hello. I am a wild animal. ");
        if (this.isPredator()){
            System.out.print("And I am angry. ");
        }
    }

    public abstract void eat();

    @Override
    public void breath() {
        System.out.print("Breath silently. ");
    }


}
