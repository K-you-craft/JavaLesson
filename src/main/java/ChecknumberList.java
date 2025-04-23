import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChecknumberList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> moji = new ArrayList<>();
		
		System.out.println("数字を入力してください");
		int num  = sc.nextInt();
		
		if(num > 10) {
			moji.add("large");
		}else {
			moji.add("small");
		}
		
		System.out.println(moji);
	}

}
