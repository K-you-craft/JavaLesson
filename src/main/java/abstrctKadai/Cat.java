package abstrctKadai;

public class Cat extends Animal {
	String name;

	public Cat(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void makeSound() {
		System.out.println("猫：にゃーにゃー！");
	}

}
