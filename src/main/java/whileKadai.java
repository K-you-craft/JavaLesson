import java.util.Scanner;

public class whileKadai {

	public static void main(String[] args) {
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
		
		
		
		
	}

}
