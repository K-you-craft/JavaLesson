public class Kadai2 {

	public static void main(String[] args) {
		DoubleInteger.print(5);
		GreaterThanTen.print(12);
		EvenOrOdd.print(7);

		double num = 4.5;
		System.out.println(num / 2);

		double num2 = 7.8;
		int a = (int) num2;
		double b = num2 - a;
		System.out.println("整数部分:" + a + ",小数部分:" + b);

		double num3 = 3.2;
		System.out.println(num3 * 10);

		int num4 = 0;
		if (num4 == 0) {
			System.out.println("0です");
		} else {
			System.out.println("0ではないです");
		}

		int num5 = -5;
		if (num5 < 0) {
			System.out.println("負数です");
		} else {
			System.out.println("正数です");
		}

		int num6 = 15;
		if (num6 % 5 == 0) {
			System.out.println("5の倍数です");
		} else {
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

		String name13 = "楊嘉琳";
		int age = 0;
		System.out.println(name13 + "は次の誕生日で" + (age + 1) + "歳です。");

		int num14 = 8;
		int num15 = 3;
		System.out.println("足し算：" + (8 + 3));
		System.out.println("引き算：" + (8 - 3));
		System.out.println("掛け算：" + (8 * 3));
		System.out.println("割り算：" + (8 / 3));
		System.out.println("余りを計算：" + (8 % 3));

		int test1 = 75;
		int test2 = 88;
		int test3 = 92;
		
		int ans = test1 + test2 + test3;
		double avg = (double)ans/3;
		
		System.out.println("合計："+ ans +"平均値：" + avg);
		
		int kakaku = 12000;
		double saleOff = 0.3;
		System.out.println("最後の価格は" + (12000*(1-0.3)));
		
		

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
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}
}
