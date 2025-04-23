import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class whileKadai {

	public static void main(String[] args) {

		//********* While **********************
		int count = 1;

		while (count <= 10) {
			System.out.print(count + " ");
			count++;
		}

		count = 1;
		int sum = 0;
		while (count <= 100) {
			sum += count;
			count++;
		}

		System.out.println();
		System.out.println("1から100までの整数の合計は" + sum);

		Scanner sc = new Scanner(System.in);
		sum = 0;
		System.out.println("数字を入力してください-->(0入力すると終わり)");
		int select = sc.nextInt();
		while (select != 0) {
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

		} while (count <= 10);

		System.out.println();
		count = 1;
		sum = 0;

		do {
			sum += count;
			count++;

		} while (count <= 100);

		System.out.println("合計は" + sum);

		sum = 0;
		count = 1;
		do {
			System.out.println("数字を入力してください-->");
			select = sc.nextInt();
			if (select != 0) {
				sum += select;
				count++;
			}

		} while (select != 0);

		System.out.println("合計は" + sum);
		
		
		//********* for文 **********************
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println("1から100までの整数の合計は" + sum);
		
		int[] arr = new int[10]; 
		for(int i = 0; i < arr.length ; i++) {
			if(i == 0 || i == 1) {
				arr[i] = 1;
			}else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		System.out.print("フィボナッチ数列:");
		
		for(int i = 0 ;i <arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		//********* 拡張for文 **********************
		System.out.println();
		int[] num = {1,2,3,4,5};
		for(int i= 0; i < num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println();
		List<String> mojiList = new ArrayList<>();
		count = 0;
		while(count < 3) {
			System.out.println("追加した文字を入力してください-->");
			String a = sc.next();
			mojiList.add(a);
			
			count++;
		}
		
		System.out.println(mojiList);
		
		
		
		int[] arr2 = {2,4,6};
		sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		System.out.println("合計は" + sum);
		
		
		
        int[] numbers = {1, 2, 3, 4, 5};
        
		for(int i = 0; i < numbers.length; i++) {
			System.out.print( numbers[i] +"," );
		}
		
		System.out.println();
		
        sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
        System.out.println("合計: " + sum);
        
        
        
        
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println(names);
        
        
        //************ break ************************

        for(int i= 1; i <= 10 ; i++) {
        	if(i > 5) {
        		break;
        	}
        	System.out.print(i + " ");
        }
        
        
        
        System.out.println();
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
        for(int i= 1; i <= arr.length ; i++) {
        	if(i > 6) {
        		break;
        	}
        	System.out.print(i + " ");
        }
        
        
        System.out.println();
        int [][]arr4 = {
        		{1,2,3},
        		{4,5},
        		{6,7,8}
        };
        
        for(int i= 0; i < arr4.length ; i++) {
        	for(int j = 0 ; j < arr4[i].length ; j++) {
        		if(arr4[i][j] == 5) {
        			break; // 外側のループまで一気に抜ける
        		}
        		System.out.print(arr4[i][j] + " ");
        		
        	}
        }
        
        
	}

}
