package interfaceKadai;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();
		
		Bird bird = new Bird();
		bird.fly();
		bird.makeSound();
		
		
		Circle c = new Circle(5);
		System.out.println("面積は" + c.calculateArea());
		
		
		Printer p = new LaserPrinter();
		p.print();
		p.showStatus();
	}

}
