package abstrctKadai;

public class Student extends Person {
	@Override
	public void introduce() {
		System.out.println("初めまして、" + super.getName() + "です");
	}

}
