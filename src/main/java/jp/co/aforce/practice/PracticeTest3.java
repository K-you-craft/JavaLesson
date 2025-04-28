package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {

	public static void main(String[] args) {
		String[] goods = {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
		
		
		System.out.println(goods[1]);
		
		
		List<String> syain = new ArrayList<String>();
		syain.add("山田太郎");
		syain.add("鈴木花子");
		syain.add("佐藤二郎");
		syain.add("山田太郎");
		syain.add("高橋三郎");
		
		
		System.out.println(syain.get(2));
		
		
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);				
		list1.add(15);				
		list1.add(16);				
		list1.add(19);				
						
		ArrayList<Integer> list2 = new ArrayList<>();				
		list2.add(11);				
		list2.add(12);				
		list2.add(18);				
		list2.add(20);				
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.addAll(list1);
		list.addAll(list2);
		
		Collections.sort(list);
		
		System.out.println(list);
		
        ArrayList<Integer> list3 = new ArrayList<>();			
        list3.add(13);			
        list3.add(14);			
        list3.add(17);			
        list3.add(21);		
        
        
		ArrayList<Integer> combinedList = new ArrayList<>();
		
		for(Integer num :list) {
			combinedList.add(num);
		}
		
		for(Integer num :list3) {
			combinedList.add(num);
		}
		
		Collections.sort(combinedList);

		System.out.println(combinedList);
	}

}
