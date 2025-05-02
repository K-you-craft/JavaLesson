package JavaTest;

import java.util.ArrayList;
import java.util.List;

public class test8 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("リンゴ");
		fruits.add("バナナ");
		fruits.add("さくらんぼ");
		
		fruits.remove("バナナ");
		fruits.add("オレンジ");
		
		System.out.println(fruits);
	}

}
