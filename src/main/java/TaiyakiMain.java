public class TaiyakiMain {

	public static void main(String[] args) {
		Taiyaki t = new Taiyaki();
		Taiyaki t2 = new Taiyaki();
		
		t.setFilling("クリーム");
		t2.setFilling("あんこ");
		
		t.showFilling();
		t2.showFilling();
	}

}

class Taiyaki {
	String filling;

	public void setFilling(String value) {
		filling = value;
	}

	public void showFilling() {
		System.out.println("このたい焼きの中身は：" + filling + "です。");

}
}
