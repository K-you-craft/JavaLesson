import java.util.HashSet;
import java.util.Set;

public class HashSetSample {

	public static void main(String[] args) {
		//重複しない
		//順番を保証されない
		
		Set<Integer> numList = new HashSet<>();
		numList.add(2);
		numList.add(1);
		numList.add(1);
		numList.add(3);
		
		System.out.println(numList);
	}

}
