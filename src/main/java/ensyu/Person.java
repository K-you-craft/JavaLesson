package ensyu;

public class Person {
	String city;
	int kokunai;
	int gaikoku;

	public Person(String city, int kokunai, int gaikoku) {
		this.kokunai = kokunai;
		this.gaikoku = gaikoku;
		this.city = city;
	}

	public double getSum() {
		int sum = kokunai + gaikoku;
		return sum;
	}

	public double getPercent() {
		return gaikoku / getSum();
	}

	public int getKokunai() {
		return kokunai;
	}

	public void setKokunai(int kokunai) {
		this.kokunai = kokunai;
	}

	public int getGaikoku() {
		return gaikoku;
	}

	public void setGaikoku(int gaikoku) {
		this.gaikoku = gaikoku;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
