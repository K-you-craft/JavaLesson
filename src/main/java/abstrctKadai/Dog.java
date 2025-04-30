package abstrctKadai;

public class Dog extends Animal {
	String name;

	public Dog(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void makeSound() {
		System.out.println(name + ": ワンワン！");
	}
}
