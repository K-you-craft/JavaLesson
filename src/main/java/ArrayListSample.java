import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<String>();

		fruitsList.add("apple");
		fruitsList.add("potato");

		System.out.println(fruitsList);

		fruitsList.add(2,"grape");
		fruitsList.add(1,"peach");

		System.out.println(fruitsList);
		
		String element1 = fruitsList.get(0);
		System.out.println("0番目の要素は"+element1);
		
		String element2 = fruitsList.get(3);
		System.out.println("3番目の要素は" + element2);
		
		fruitsList.remove(3);
		System.out.println(fruitsList);
		
		fruitsList.remove("peach");
		System.out.println(fruitsList);
	}

}
