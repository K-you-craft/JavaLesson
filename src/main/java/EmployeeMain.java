import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.setID("AC001");
		e1.setName("佐藤");
		e1.setMoney(200000);
		
		Employee e2 = new Employee();
		e2.setID("AC002");
		e2.setName("佐藤");
		e2.setMoney(200000);
		
		System.out.println("ID:" + e1.getID());
		System.out.println("名前：" + e1.getName());
		System.out.println("給与：" + e1.getMoney());
		
		System.out.println("ID:" + e2.getID());
		System.out.println("名前：" + e2.getName());
		System.out.println("給与：" + e2.getMoney());
		
		System.out.println("--------------------------");
		if(e1.equals(e2)) {
			System.out.println("社員IDは同じです");
		}
		
		System.out.println("昇給を入力してください-->");
		double percent = sc.nextDouble(); 
		
		e1.raiseSalary(percent);
	}
}
