import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.ID ="AC001";
		e1.name = "佐藤";
		e1.money = 200000;
		
		e2.ID ="AC001";
		e2.name = "田中";
		e2.money = 200000;
		
		System.out.println("ID:" + e1.ID);
		System.out.println("名前：" + e1.name);
		System.out.println("給与：" + e1.money);
		
		System.out.println("ID:" + e2.ID);
		System.out.println("名前：" + e2.name);
		System.out.println("給与：" + e2.money);
		
		System.out.println("--------------------------");
		if(e1.equals(e2)) {
			System.out.println("社員IDは同じです");
		}
		
		System.out.println("昇給を入力してください-->");
		double percent = sc.nextDouble(); 
		
		e1.raiseSalary(percent);
	}
}
