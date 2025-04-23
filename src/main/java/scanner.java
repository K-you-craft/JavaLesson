import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("商品の名前入力してください-->");
		
		String fruit = sc.next();
		
		System.out.println("あなた入力したのは" + fruit);
	}

}
