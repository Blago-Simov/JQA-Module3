package Homework06;

public class Cat extends Animal implements IAnimal{
    public void makeSomeNoise(){
        System.out.println("Meow!Meow!");
    }
    @Override
    void play(){
        System.out.println("Cats can play with balls!");
    }

    public void climb(){
        System.out.println("Cats can climb trees!");
    }

    public void catsInfo(){
        System.out.println("Cats live in " + environment);
        System.out.println("Cats have " + numberOfLegs + " legs");
        System.out.println("Cats have " + typeOfSkin + " skin");

    }
}
