import java.util.Scanner;

public class whileKadai {

	public static void main(String[] args) {
		
		//********* While **********************
		int count = 1;
		
		while(count <= 10) {
			System.out.print(count + " ");
			count++;
		}
		
		count = 1;
		int sum = 0;
		while(count <= 100) {
			sum += count;
			count++;
		}
		
		System.out.println();
		System.out.println("1から100までの整数の合計は" + sum);
		
		
		Scanner sc = new Scanner(System.in);
		sum = 0;
		System.out.println("数字を入力してください-->(0入力すると終わり)");
		int select = sc.nextInt(); 
		while(select != 0) {
			sum += select;
			
			System.out.println("数字を入力してください-->(0入力すると終わり)");
			select = sc.nextInt(); 
		}
		
		System.out.println("合計は" + sum);
		
		
		//********* Do - While **********************
		
		count = 1;
		
		do {
			System.out.print(count + " ");
			
			count++;
			
		}while (count <= 10);
		
		System.out.println();
		count = 1;
		sum = 0;
		
		
		do {
			sum += count;
			count++;
			
		}while (count <= 100);
		
		System.out.println("合計は" + sum);
		
		
		sum = 0;
		select = sc.nextInt();
		do {
			sum += count;
			count++;
			
		}while (count <= 100);
		
		System.out.println("合計は" + sum);
	}

}
