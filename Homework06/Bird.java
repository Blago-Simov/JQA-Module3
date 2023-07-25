package Homework06;

public class Bird extends Animal implements IAnimal{

    public void makeSomeNoise(){
        System.out.println("Tweet!Tweet!");
    }
    @Override
    void play(){
        System.out.println("Birds can play in the air!");
    }

    public void fly(){
        System.out.println("Birds can fly at different latitudes!");
    }

    public void sing(){
        System.out.println(("Birds can sing!"));
    }
     public void sing(int numbersOfBirds){
         System.out.println("Birds can sing " + numbersOfBirds + "times louder!");
     }

     public void birdsInfo(){
         System.out.println("Birds live in " + environment);
         System.out.println("Birds have " + numberOfLegs + " legs");
         System.out.println("Birds have " + typeOfSkin + " skin");

     }
}
