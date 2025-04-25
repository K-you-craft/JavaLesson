import java.util.Scanner;

public class overLoadKadai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cc = new Calculator();
		Rectangle r1 = new Rectangle(4, 2);
		Rectangle r2 = new Rectangle(4);
		getAdd add = new getAdd();

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;

		int res1 = cc.ans(num1, num2);
		int res2 = cc.ans(num1, num2, num3);

		System.out.println(num1 + " + " + num2 + " = " + res1);
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + res2);

		System.out.println("------------------------------------");

		System.out.println("長方形の幅は：" + r1.length + " , 高さは：" + r1.height);
		System.out.println("正方形の幅は：" + r2.length);

		System.out.println("------------------------------------");

		System.out.println("和1: " + add.sum(1, 2, 3)); 
		System.out.println("和2: " + add.sum(10, 20, 30, 40)); 
		System.out.println("和3: " + add.sum(5)); 
		System.out.println("和4: " + add.sum());
	}
}

class Calculator {

	public int ans(int num1, int num2) {
		return num1 + num2;
	}

	public int ans(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}

class Rectangle {
	int length;
	int height;

	public Rectangle(int length, int height) {
		this.height = height;
		this.length = length;
	}

	public Rectangle(int length) {
		this.length = length;
	}
}

class getAdd {
	Integer numList;

	public int sum(int... numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}
}
