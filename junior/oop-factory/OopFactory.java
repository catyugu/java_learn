import animalpack.AnimalBase;
import animalpack.AnimalFactory;

class OopFactory {
    public static void main(String[] args)
    {
        AnimalBase animal;
        try{
            animal = AnimalFactory.getAnimal("cat");
            animal.eat();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}