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
		Scanner sc = new Scanner(System.in);
		System.out.println("名前入力してください-->");
		String namae = sc.next();

		System.out.println("年齢入力してください-->");
		String age = sc.next();

		System.out.println("誕生日入力してください-->");
		String brithday = sc.next();

		String res = String.format("名前：%s, 年齢：%s, 誕生日：%s", namae, age, brithday);

		System.out.println(res);

		
		//問７：******************************
		Scanner sc = new Scanner(System.in);
		System.out.println("商品命入力してください-->");
		String namae = sc.next();
		
		System.out.println("価格入力してください-->");
		double money = sc.nextDouble();
		
		System.out.println("購入個数入力してください-->");
		int num = sc.nextInt();
		
		
		double sum = num * money;
		
		System.out.println("合計金額：" + sum);
		
		System.out.println("商品: "+ namae + "は、価格：" + money + "円なので、"+ 
				num +"個買うと" + sum+"円です。");
		
		
		//問８：******************************
		-45;
		
		
		//問9：******************************
		14;

		
		//問10：******************************
		avogr;
		
		
		//問11：******************************
        LocalDate today = LocalDate.now();

        LocalDate birth = LocalDate.of(1995, 1, 15);
        
        LocalDate next = birth.withYear(today.getYear());//-->2025/1/15

        if(next.isBefore(today) || next.isEqual(today)) {
        	next = next.plusYears(1);
        }
        
        long day = ChronoUnit.DAYS.between(today, next);
        
        System.out.println("今度の誕生日まで後"+day+"日");
		
        
      //問12：******************************
        B,D
        
        
      //問13：******************************
        5
        
        
      //問14：******************************
        B. MAX = 200;
        
        
      //問15：******************************
        9
        
        
      //問16：******************************
        //×、ローカル変数 x が初期化されていない;
        
        
      //問17：******************************
        B
        
        
      //問1８：******************************
        B
        
        
      //問19：******************************
        A
        
        
      //問20：******************************
        A
        
	}

}
