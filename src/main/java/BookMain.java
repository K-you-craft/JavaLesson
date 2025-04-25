
public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("ダンジョン飯","九井諒子");

		book1.price = 2500; 
		
		book1.showInfo();
	}

}

class Book{
	String title;
	String author;
	double price;
	
	public Book(String title, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("タイトル：" + title);
		System.out.println("著者：" + author);
		System.out.println("価格" + price);
	}
}
