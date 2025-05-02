package JavaTest;

import java.util.ArrayList;
import java.util.List;

public class test11 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		
		//初期化
		books.add(new Book("「Python入門」","山田太郎",1500,2500));
		books.add(new Book("「データ分析の基礎」","鈴木花子",1200,3000));
		books.add(new Book("「AI技術最前線」","佐藤一郎",800,4000));
		books.add(new Book("「Webデザイン講座」","田中美咲",2000,2000));
		books.add(new Book("「はじめての機械学習」","中村健一",900,3500));
		
		
		//総売上額
		int total = 0;
		for(Book b : books) {
			int num = b.getNum();
			int price = b.getPrice();
			total += num * price;
		}
		
		
		
		System.out.println("全書籍の総売上額は" + total + "円");
		
		
		
		System.out.println("販売数が1000冊を超える書籍:");
		for(Book b : books) {
			int num = b.getNum();
			if(num >= 1000) {
				System.out.print(b.getBookName() + " ");
			}
		}
		
		
		
		double max = 0;
		for(Book b : books) {
			int num = b.getNum();
			int price = b.getPrice();
			double m = num / price;
			
			if(max < m) {
				max = m;
			}
		}
		
		
		System.out.println();
		System.out.println("販売効率が最も高い書籍:");
		String GoodBook;
		for(Book b : books) {
			int num = b.getNum();
			int price = b.getPrice();
			double m = num / price;
			
			if(max == m) {
				System.out.println(b.getBookName()+ ":" + m*100 + "%");
			}
		}
	}
	
		

}
