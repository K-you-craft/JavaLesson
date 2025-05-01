package abstrctKadai;

public class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println(super.getName() + "：にゃーにゃー！");
	}

}
