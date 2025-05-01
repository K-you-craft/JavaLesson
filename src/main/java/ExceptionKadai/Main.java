package ExceptionKadai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//演習問題１
		System.out.println("整数を入力してください-->");
		
		try {
			int num = Integer.parseInt(sc.next());
			System.out.println("result:" + (num / 2));
			
		}catch(NumberFormatException e) {
			System.out.println("入力が整数ではない" + e.getMessage());
		}
		
		System.out.println("------------------------------------");
		//演習問題２
		
        try {
            int result = 10 / 0;
            System.out.println("計算結果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("例外が発生しました: " + e.getMessage());
        }
        System.out.println("プログラム終了");
        
        
    	System.out.println("------------------------------------");
    	
    	//演習問題３
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException が発生しました");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException が発生しました");
        } catch (Exception e) {
            System.out.println("Exception が発生しました");
        }
        
        
        System.out.println("------------------------------------");
      //演習問題４
        try {						
            System.out.println("try ブロック開始");						
            throw new RuntimeException("エラー発生");						
        } catch (Exception e) {						
            System.out.println("catch ブロック: " + e.getMessage());						
        } finally {						
            System.out.println("finally ブロック");						
        }						
        System.out.println("プログラム終了");						

        System.out.println("------------------------------------");
      //演習問題５
        
        try {
        	int num1 = 10 / 0;
        	System.out.println("結果：" + num1);
        	
        }catch(ArithmeticException e) {
        	System.out.println("0で割ることはできません");
        }
        
        System.out.println("------------------------------------");
      //演習問題６
        
        int[] arr = {1,2,3};
        
        try {
        	System.out.println(arr[4]);
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("配列の範囲外です");
        }
        
        System.out.println("------------------------------------");
      //演習問題７
        
        System.out.println("整数を入力してください");
        
        try {
        	int num3 = Integer.parseInt(sc.next());
        	
        	double res = 10 / num3;
        	System.out.println(res);
        	
        }catch(NumberFormatException e) {
        	System.out.println("数値を入力してください");
        }catch(ArithmeticException e) {
        	System.out.println("0で割ることはできません");
        }
        
	}

}
