import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		//問１：******************************
		int num;
		num = 10;
		System.out.println(num);

		//問2：******************************
		int a;
		int b;

		a = 8;
		b = 5;
		int sum = a + b;
		System.out.println(sum);

		//問３：******************************
		int width = 7;
		int height = 4;
		int area = 7 * 4;
		System.out.println("面積は" + area);

		//問４：******************************
		String name = "Java";
		double version = 17.0;
		boolean isFun = true;

		//問５：******************************
		Scanner sc = new Scanner(System.in);
		System.out.println("名前入力してください-->");
		String namae = sc.next();
		System.out.println("こんにちは、「" + namae + "」さん！");

		//問6：******************************
		System.out.println("名前入力してください-->");
		String namae1 = sc.next();

		System.out.println("年齢入力してください-->");
		String age = sc.next();

		System.out.println("誕生日入力してください-->");
		String brithday = sc.next();

		String res = String.format("名前：%s, 年齢：%s, 誕生日：%s", namae1, age, brithday);

		System.out.println(res);

		
		//問７：******************************
		System.out.println("商品命入力してください-->");
		String product = sc.next();
		
		System.out.println("価格入力してください-->");
		double money = sc.nextDouble();
		
		System.out.println("購入個数入力してください-->");
		int num1 = sc.nextInt();
		
		
		double sum1 = num1 * money;
		
		System.out.println("合計金額：" + sum1);
		
		System.out.println("商品: "+ product + "は、価格：" + money + "円なので、"+ 
				num1 +"個買うと" + sum1+"円です。");
		
		
		//問11：******************************
        LocalDate today = LocalDate.now();

        LocalDate birth = LocalDate.of(1995, 1, 15);
        
        LocalDate next = birth.withYear(today.getYear());//-->2025/1/15

        if(next.isBefore(today) || next.isEqual(today)) {
        	next = next.plusYears(1);
        }
        
        long day = ChronoUnit.DAYS.between(today, next);
        
        System.out.println("今度の誕生日まで後"+day+"日");
        
	}

}
