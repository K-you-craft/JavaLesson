package interfaceKadai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice",80));
		students.add(new Student("Bob",76));
		students.add(new Student("Jack",88));
		students.add(new Student("Jay",66));
		
		Collections.sort(students, new ScoreComparator());
		
		for(Student s : students) {
			System.out.println(s.name + " : " + s.score);
		}
	}

}
