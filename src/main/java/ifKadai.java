import java.util.Scanner;

public class ifKadai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("偶数です。");
		}else {
			System.out.println("奇数です。");
		}
		
		if(num >= 0) {
			System.out.println("正数です。");
		}else {
			System.out.println("負数です。");
		}
		
		System.out.println("三つの整数を入力してください-->");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 - num2 > num3) {
			System.out.println("三角形の辺の長さとして有効");
		}else {
			System.out.println("三角形の辺の長さとして無効");
		}
		
		
		int age = sc.nextInt(); 
		if(age <= 12) {
			System.out.println("無料です。");
		}else if (age <= 59) {
			System.out.println("1000円です。");
		}else {
			System.out.println("500円です。");
		}
		
		
		
	}

}
