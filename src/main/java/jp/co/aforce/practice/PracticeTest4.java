package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PracticeTest4 {

	public static void main(String[] args) {
		List<String> animal = new ArrayList<String>();
		animal.add("犬");
		animal.add("猫");
		animal.add("うさぎ");
		animal.add("へび");

		String like = "犬";
		String msg = "はリストに含まれていません";
		for (String pet : animal) {
			if (like.equals(pet)) {
				msg = "はリストに含まれています";
			}
		}
		System.out.println(msg);
		
		
		

		Calendar rightNow = Calendar.getInstance();
		int month = rightNow.get(Calendar.MONTH) + 1;

		System.out.print(month + "月：");
		switch (month) {
		case 1:
			System.out.println("冬物セール");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("春物セール");
			break;
		case 6:
		case 7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
			break;

		}
	}
}
