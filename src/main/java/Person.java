
public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "名前: " + this.name + ", 年齢: " + this.age;
	}
}
