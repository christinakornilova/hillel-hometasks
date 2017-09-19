package hillel.hometask.ht20;

public class Main {

    public static void main(String[] args) {
        Cat cat_Blacky = new Cat("Blacky", "regular domestic cat.", "", true);
        Dog dog_Barky = new Dog("Barky");
        Hamster ham_Reddie = new Hamster("Reddie");
        Fish fish_Goldie = new Fish("Goldie");

        Giraffe giraffe = new Giraffe(false);
        Lion lion = new Lion(true);
        Crocodile croco = new Crocodile(true);

        GuideDog gd_Hatiko = new GuideDog(true, true,"Hatiko");

        System.out.println("---------------------");
        System.out.println("All about cat:");
        System.out.println("---------------------");
        cat_Blacky.voice();
        cat_Blacky.breath();
        cat_Blacky.eat();
        cat_Blacky.move();
        cat_Blacky.setId(1);
        cat_Blacky.setAge((byte)5);
        cat_Blacky.setColor("black");
        cat_Blacky.setWeight(7.0);
        cat_Blacky.showBreed();
        cat_Blacky.showType();
        cat_Blacky.showAllMetrics();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("All about dog:");
        System.out.println("---------------------");
        dog_Barky.voice();
        dog_Barky.breath();
        dog_Barky.eat();
        dog_Barky.move();
        dog_Barky.setId(2);
        dog_Barky.setAge((byte)9);
        dog_Barky.setColor("white");
        dog_Barky.setVaccinated(true);
        dog_Barky.setWeight(19.0);
        dog_Barky.trace();
        dog_Barky.showAllMetrics();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("About guide dog:");
        System.out.println("---------------------");
        gd_Hatiko.voice();
        gd_Hatiko.takeHome();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("All about Hamster:");
        System.out.println("---------------------");
        ham_Reddie.voice();
        ham_Reddie.breath();
        ham_Reddie.eat();
        ham_Reddie.move();
        ham_Reddie.setId(3);
        ham_Reddie.setAge((byte)1);
        ham_Reddie.setColor("red");
        ham_Reddie.setVaccinated(false);
        ham_Reddie.setWeight(0.5);
        ham_Reddie.showAllMetrics();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("All about Fish:");
        System.out.println("---------------------");
        fish_Goldie.voice();
        fish_Goldie.breath();
        fish_Goldie.eat();
        fish_Goldie.move();
        fish_Goldie.setId(4);
        fish_Goldie.setAge((byte)0);
        fish_Goldie.setColor("gold");
        fish_Goldie.setVaccinated(false);
        fish_Goldie.setWeight(0.1);
        fish_Goldie.showAllMetrics();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("All about Giraffe:");
        System.out.println("---------------------");
        giraffe.voice();
        giraffe.breath();
        giraffe.eat();
        giraffe.move();
        giraffe.setId(5);
        giraffe.setAge((byte)10);
        giraffe.setColor("yellow with brown");
        giraffe.setWeight(100.9);
        giraffe.setPredator(false);
        giraffe.showAllMetrics();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("All about Lion:");
        System.out.println("---------------------");
        lion.voice();
        lion.breath();
        lion.eat();
        lion.move();
        lion.setId(6);
        lion.setAge((byte)8);
        lion.setColor("yellow");
        lion.setWeight(80.7);
        lion.setPredator(true);
        lion.showAllMetrics();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("All about Crocodile:");
        System.out.println("---------------------");
        croco.voice();
        croco.breath();
        croco.eat();
        croco.move();
        croco.setId(7);
        croco.setAge((byte)88);
        croco.setColor("green");
        croco.setWeight(500.0);
        croco.setPredator(true);
        croco.showAllMetrics();
        System.out.println("---------------------");


    }
}
