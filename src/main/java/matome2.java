import java.util.ArrayList;
import java.util.List;

public class matome2 {

	public static void main(String[] args) {
		List<Integer> scroeList = new ArrayList<>();
	
		scroeList.add(85);
		scroeList.add(92);
		scroeList.add(78);
		scroeList.add(65);
		scroeList.add(98);
		scroeList.add(70);
		
		int count = 0;
		
		for(Integer ten : scroeList) {
			if(ten >= 70) {
				count++;
			}
		}
		
		System.out.println("70点以上の得点の数は" + count +"個です");
	}

}
