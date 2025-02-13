import mypackage.Animal;
import mypackage.Dog;
import mypackage.Cat;

public class Main {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();
        animal.displayInfo();

        System.out.println("-----------------------------");

        Dog dog = new Dog("Buddy");
        dog.makeSound(); 
        dog.displayInfo();
        dog.fetch();

        System.out.println("-----------------------------");

        Cat cat = new Cat("Whiskers");
        cat.makeSound(); 
        cat.displayInfo();
        cat.climb();
    }
}