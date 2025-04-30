package abstrctKadai;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.move();

		Animal dog = new Dog("犬");
		Animal cat = new Cat("猫");
		dog.makeSound();
		dog.sleep();

		cat.makeSound();
		cat.sleep();
		
		
		Person student1 = new Student();
		student1.setName("佐藤");
		student1.introduce();
	}

}
