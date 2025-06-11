package animalpack;
import animalpack.AnimalBase;
public class Dog extends AnimalBase {
    @Override
    public void eat()
    {
        System.out.println("狗狗吃!Woof!");
    }
}