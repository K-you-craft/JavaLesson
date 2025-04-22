public class Kadai2 {

	public static void main(String[] args) {
		DoubleInteger.print(5);
		GreaterThanTen.print(12);
		EvenOrOdd.print(7);
		
		double num = 4.5;
		System.out.println(num /2);
		
		double num2 = 7.8;
		int a = (int)num2 ;
		double b = num2 -a;
		System.out.println("整数部分:"+ a +",小数部分:" + b);
		
		double num3 = 3.2;
		System.out.println(num3 * 10);
		
		int num4 = 0;
		if(num4 == 0) {
			System.out.println("0です");
		}else {
			System.out.println("0ではないです");
		}
		
		int num5 = -5;
		if(num5 < 0) {
			System.out.println("負数です");
		}else {
			System.out.println("正数です");
		}
		
		int num6 = 15;
		if(num6 % 5 == 0) {
			System.out.println("5の倍数です");
		}else {
			System.out.println("5の倍数じゃないです");
		}
		
		
		int num7 = 8;
		int num8 = 3;
		System.out.println(num7 + num8);
		
		int num9 = 10;
		int num10 = 4;
		System.out.println(num9 - num10);
		
		int num11 = 6;
		int num12 = 7;
		System.out.println(num11 * num12);
		
	}
}

class DoubleInteger {
	public static void print(int num) {
		System.out.println(num + "×2=" + (num * 2));
	}
}

class GreaterThanTen {
	public static void print(int num) {
		if (num > 10) {
			System.out.println("10より大きい");
		} else {
			System.out.println("10より小さい");
		}
	}
}

class EvenOrOdd {
	public static void print(int num) {
		if(num % 2 == 0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
	}
}
