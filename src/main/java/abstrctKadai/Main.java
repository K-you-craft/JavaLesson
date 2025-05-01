package abstrctKadai;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		//演習問題１
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.setName("犬");
		dog.makeSound();
		dog.sleep();

		cat.setName("猫");
		cat.makeSound();
		cat.sleep();
		
		
		//演習問題２
		Vehicle car = new Car();
		car.move();
		
		
		//演習問題３
		Person student1 = new Student();
		student1.setName("佐藤");
		student1.introduce();
		
		
		//演習問題４
		Shape rectangle = new Rectangle(2,4);
		double area = rectangle.calculateArea();
		double peri = rectangle.calculatePerimeter();
		System.out.println("面積は" + area);
		System.out.println("周囲長は" + peri);
		
		
		//演習問題５
		Device computer = new Computer();
		computer.powerOn();
		computer.useDevice();
		
		
		//演習問題７
		Microwave m = new Microwave();
		m.turnOn();
		m.turnOff();
		
		
		String reversed = StringUtils.reverse("example");
		String trimmed  = StringUtils.trim("example");
		boolean contains = StringUtils.contains("example", "amp");
		System.out.println(reversed);
		System.out.println(trimmed);
		System.out.println(contains);
	}

}
