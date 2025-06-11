package animalpack;
import animalpack.AnimalBase;
public class Cat extends AnimalBase {
    @Override
    public void eat() {
        System.out.println("猫猫吃!Meow!");
    }
}