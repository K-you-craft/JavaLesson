package JavaTest;

public class Book {
	String bookName;
	String author;
	int num;
	int price;
	
	public Book(String bookName, String author, int num, int price) {
		this.bookName = bookName;
		this.author = author;
		this.num = num;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
