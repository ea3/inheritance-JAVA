public class Main {
    public static void main(String [] args){

        Animal animal = new Animal("Animal", 1,1,5, 5);

        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"Long Silky");

        Fish fish = new Fish("Pescao",5,24,2,2,5 );

        dog.eat();
        dog.walk();
        dog.run();
        fish.swin(12);

    }
}

