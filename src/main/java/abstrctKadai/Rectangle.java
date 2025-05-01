package abstrctKadai;

public class Rectangle extends Shape{
	private double w,h;

	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double calculateArea() {
		return w * h;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (w + h);
	}
	
}
