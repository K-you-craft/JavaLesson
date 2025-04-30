package abstrctKadai;

abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public abstract void makeSound();
	
	void sleep() {
		System.out.println(name + "が寝ている");
	}
}
