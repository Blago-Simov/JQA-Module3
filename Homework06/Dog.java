package Homework06;

public class Dog extends Animal implements IAnimal{
    @Override
    public void makeSomeNoise() {
        System.out.println("Woof! Woof!");
    }

    @Override
    void play(){
        System.out.println("Dogs pursuit cats!");
    }

    public void bringStick(){
        System.out.println("Dogs can carry sticks!");
    }

    public void dogsInfo(){
        System.out.println("Dogs live in " + environment);
        System.out.println("Dogs have " + numberOfLegs + " legs");
        System.out.println("Dogs have " + typeOfSkin + " skin");

    }
}
