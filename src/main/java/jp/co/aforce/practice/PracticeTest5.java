package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(4);
		System.out.println(num);
		switch (num){
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("大吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default :
			System.out.println("凶です");
			break;
		}
		
		
		
		for(int i =1 ; i <= 100 ;i++) {
			if(i % 7 == 0) {
				System.out.print(i + " ,");
			}
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		
		
		for(int i = 1; i <= 9 ;i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%2d  ", i *j );
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		int count = 10;
		for(int i = count; i <= count*2-1 ;i++) {
			for(int j = count ; j <= count*2-1 ; j++) {
				System.out.printf("%3d  ", i*j);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		
		ArrayList<String> employees = new ArrayList<>();					
		employees.add("斎藤");					
		employees.add("田中");					
		employees.add("山田");					
		employees.add("鈴木");					
		employees.add("高橋");					
							
		ArrayList<String> submitters = new ArrayList<>();					
		submitters.add("斎藤");					
		submitters.add("高橋");		
		
		for(String name : employees) {
			if(!submitters.contains(name)){
				System.out.println("未提出者：" + name);
			}
		}
		
		
		System.out.println("--------------------------------------");
        for (int num1 = 2; num1 <= 100; num1++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num1 + " ");
            }
        }
		

		
	}

}
