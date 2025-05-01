package abstrctKadai;

abstract class Animal {
	String name;
	
	public abstract void makeSound();
	
	public void sleep() {
		System.out.println(name + "が寝ている");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
