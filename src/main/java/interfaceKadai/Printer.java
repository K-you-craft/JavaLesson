package interfaceKadai;

public interface Printer {
	void print() ;
	default void showStatus() {
		System.out.println("こっちはshowStatusメソッド");
	}
}
