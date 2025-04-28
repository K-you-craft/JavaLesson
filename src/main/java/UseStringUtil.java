
public class UseStringUtil {

	public static void main(String[] args) {
		String name = "山田太郎";
		String address = "東京都千代田区";
		String emptyString = "";
		String nullString = null;
		
		System.out.println("nameが空かどうか：" + name.isEmpty());
		System.out.println("addressが空かどうか：" + address.isEmpty());
		System.out.println("emptyStringが空かどうか：" + StringUtil.isEmpty(emptyString));
		System.out.println("nullStringが空かどうか：" + StringUtil.isEmpty(nullString));
		
	}
}
