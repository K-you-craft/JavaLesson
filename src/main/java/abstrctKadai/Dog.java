package abstrctKadai;

public class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println(super.getName() + ": ワンワン！");
	}
}
