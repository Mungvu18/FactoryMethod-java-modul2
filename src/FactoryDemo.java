import javax.lang.model.element.AnnotationMirror;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound " + animal1.makeSound());
        Animal animal = animalFactory.getAnimal("canine");
        System.out.println("a2 sound " + animal.makeSound());
     }
}
