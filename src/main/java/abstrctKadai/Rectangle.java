package abstrctKadai;

public class Rectangle extends Shape{
	double n;

	@Override
	public double calculateArea(double n) {
		return n * n;
	}

	@Override
	public double calculatePerimeter(double n) {
		return 4 * n;
	}
	
}
