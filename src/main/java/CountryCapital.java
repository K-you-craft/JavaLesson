import java.util.HashMap;

public class CountryCapital {

	public static void main(String[] args) {
		HashMap<String,String> CountryList = new HashMap<>();
		
		CountryList.put("日本", "東京");
		CountryList.put("アメリカ合衆国", "ワシントンD.C.");
		CountryList.put("フランス", "パリ");
		CountryList.put("中国", "北京");
		
		
		//keyをもらう
		for(String key : CountryList.keySet()) {
			String value = CountryList.get(key);
			System.out.println("国名："+ key +" 首都：" + value);
		}
		
		System.out.println("--------------------------------");
		System.out.println("「日」を含む国とその首都の表示​:");
		
		for(String key : CountryList.keySet()) {
			String value = CountryList.get(key);
			if(key.contains("日")) {
				System.out.println("国名："+ key +" 首都：" + value);
			}
		}
	}

}
