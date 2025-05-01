
public class ExceptionPractice {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("ヌルが発生しました。" + e.getMessage());
		}

		System.out.println("プログラムは継続します");
		System.out.println("-------------------------------");

		try {
			int[] num = { 1, 2, 3 };
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列のミスが発生しました。" +e.getMessage());
		}
		System.out.println("プログラムは継続します");
		System.out.println("-------------------------------");
		
		try {
			int age = 15;
			if(age < 18) {
				throw new IllegalArgumentException("18歳未満は登録できない");
			}
			System.out.println("登録が完了しました。");
		}catch(IllegalArgumentException e) {
			System.out.println("例外が発生しました：" + e.getMessage());
		}
		
	}

}
