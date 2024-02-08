public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Dog();
        Animal anotherAnimal = new Animal();

        // this works, but uses the overridden makeNoise method from the Dog subclass
        animalMethod(animal);

        // this won't work because the Dog object is being upcasted to Animal, which
        // doesn't have the growl method
        // animal.growl();

        // doesn't work without the check in the method because the argument provided is not 
        // an object of Dog type, as it is being downcast to in the method
        animalMethod(anotherAnimal);
    }

    public static void animalMethod(Animal animal) {
        animal.makeNoise();

        // creating a type check in order to make sure the argument provided is the correct type
        if (animal instanceof Dog) {
            // downcasting the Dog subclass type onto the Animal type argument
            Dog dog = (Dog) animal;
            dog.growl();
        }
    }
}
