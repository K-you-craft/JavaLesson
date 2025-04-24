import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListKadai {

	public static void main(String[] args) {
		System.out.println("コレクション*************************************");
		List<Integer> List1 = new ArrayList<>();
		
		List1.add(6);
		List1.add(25);
		List1.add(25);
		List1.add(78);
		List1.add(9);
		
		Collections.reverse(List1);
		System.out.println("逆順：" + List1);
		
		HashSet<Integer> List2 = new HashSet<>();
		
		List2.add(6);
		List2.add(25);
		List2.add(25);
		List2.add(78);
		List2.add(9);
		
		System.out.println("削除した後：" + List2);
		
		
		List<String> List3 = new ArrayList<>();
		
		List3.add("リンゴ");
		List3.add("バナナ");
		List3.add("さくらんぼ");
		
		List3.remove("バナナ");
		
		List3.add("オレンジ");
		
		System.out.println(List3);
		
		
		System.out.println("リスト*************************************");
		List<String> aList = new LinkedList<>();
		
		aList.add("おはようございます");
		aList.add("今日はいい天気ですね");
		aList.add("散歩しましょう");
		
		System.out.println(aList);
		
		
		List<Integer> bList = new ArrayList<>();
		
		bList.add(5);
		bList.add(1);
		bList.add(3);
		
		boolean flag = bList.contains(5);
		
		if(flag) {
			System.out.println("値は存在している");
		}else {
			System.out.println("値は存在しない");
		}
		
		
		List<String> cList = new ArrayList<>();
		
		cList.add("D");
		cList.add("B");
		cList.add("A");
		cList.add("C");
		
		Collections.sort(cList);
		
		System.out.println(cList);
		
		
		System.out.println("ハッシュ*************************************");

		HashMap<String, Integer> dList = new HashMap<>();
		
		dList.put("Bob", 2);
		dList.put("Alice", 8);
		dList.put("Tom", 5);
		
		System.out.println("Alice : " + dList.get("Alice"));
		
		
		HashSet<String> eList = new HashSet<>();
		
		eList.add("K");
		eList.add("F");
		eList.add("C");
		
		System.out.println(eList);
		
		HashMap<String, Integer> fList = new HashMap<>();
		fList.put("Bob", 2);
		fList.put("Alice", 8);
		fList.put("Tom", 5);
		
		System.out.println(fList);
		
		System.out.println("配列とリスト*************************************");
		Integer[] arr = {1, 2, 3, 4, 5};
		
		List<Integer> gList = new ArrayList<>(Arrays.asList(arr));//配列->List
		
		System.out.println(gList);
		
		
		
		List<Integer> hList = new ArrayList<>();
		
		hList.add(1);
		hList.add(2);
		hList.add(3);
		hList.add(4);
		hList.add(5);
		
		Integer []arr2 = hList.toArray(new Integer[0]);
		
		for(int i = 0; i< arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		
		
		System.out.println();
		String[] studentName = {"佐藤","田中","鈴木","長崎"};
		int[] seseki = {80 , 90 , 86 , 79};
		
		int sum = 0;
		System.out.println("成績一覧-------------");
		for(int i = 0; i < studentName.length ; i++) {
			sum += seseki[i];
			 System.out.printf("%s: %d点\n", studentName[i], seseki[i]);
		}
		
		double avg = (double)sum/studentName.length;
		
		System.out.println("平均点数は" + avg);
		
		
		
		
	}

}
