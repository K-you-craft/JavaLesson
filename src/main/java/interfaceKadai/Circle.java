package interfaceKadai;

public class Circle implements MathConstants{
	private double r;

	public Circle(double r) {
		this.r = r;
	}
	
	double calculateArea() {
		return r * r * PI;
	}
	
	
}
