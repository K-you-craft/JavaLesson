package JavaTest;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		//問7
		Scanner sc = new Scanner(System.in);
		System.out.println("年齢を入力してください-->");
		int age = sc.nextInt();
		
		if(age < 0  || age > 120) {
			System.out.println("正しい年齢を入力してください");
		}else {
			if(age <= 3) {
				System.out.println("入場料:無料");
			}else if(age <= 12) {
				System.out.println("入場料:500円");
			}else if(age <= 17) {
				System.out.println("入場料:800円");
			}else if(age <= 59) {
				System.out.println("入場料:1200円");
			}else {
				System.out.println("入場料:700円");
			}
		}
	}
}
