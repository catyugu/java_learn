package animalpack;
import animalpack.AnimalBase;
public class AnimalFactory {
    public static AnimalBase getAnimal(String animal){
        if(animal.equals("cat")){
            return new Cat();
        } else if(animal.equals("dog")){
            return new Dog();
        } else {
            throw new RuntimeException("No such animal");
        }
    }
}