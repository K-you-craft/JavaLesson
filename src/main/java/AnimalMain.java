
public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.makeSound();
		dog.makeSound();
		
		System.out.println("-------------------------");
		
		Animal newDog = new Dog();
		newDog.makeSound();
	}

}
