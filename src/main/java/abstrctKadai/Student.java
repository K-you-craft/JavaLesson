package abstrctKadai;

public class Student extends Person {
	private String name;
	
	public Student() {
		
	}

	@Override
	public void introduce() {
		System.out.println("初めまして、" + this.getName() + "です");
	}

}
