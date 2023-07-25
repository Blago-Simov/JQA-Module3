package Homework06;

public class AnimalDemo {

    public static void main(String[] args) {

        Bird blueAra = new Bird();
        blueAra.typeOfSkin = "Blue feathers";
        blueAra.numberOfLegs = 2;
        blueAra.environment = "South America";

        Cat angoraCat = new Cat();
        angoraCat.typeOfSkin = "Hair";
        angoraCat.numberOfLegs = 4;
        angoraCat.environment = "House";

        Dog goldenRetriever = new Dog();
        goldenRetriever.typeOfSkin = "Hair";
        goldenRetriever.numberOfLegs = 4 ;
        goldenRetriever.environment = "House";

        blueAra.play();
        blueAra.makeSomeNoise();
        blueAra.birdsInfo();
        System.out.println();
        angoraCat.play();
        angoraCat.makeSomeNoise();
        angoraCat.catsInfo();
        System.out.println();
        goldenRetriever.play();
        goldenRetriever.makeSomeNoise();
        goldenRetriever.dogsInfo();

    }
}
