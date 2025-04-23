import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class matomeKadai {

	public static void main(String[] args) {
		Map<String , Integer> fruitsList = new HashMap<>(); 	
		Scanner sc = new Scanner(System.in);
		
		fruitsList.put("リンゴ", 100);
		fruitsList.put("みかん", 80);
		fruitsList.put("バナナ", 120);
		fruitsList.put("イチゴ", 300);
		
		System.out.println("果物の名前入力してください-->");
		String name = sc.next();
		
		if(fruitsList.containsKey(name)) {
			System.out.println(name +"は"+fruitsList.get(name) + "円です。");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
	}
}
