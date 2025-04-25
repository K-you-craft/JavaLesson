import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		Scanner sc = new Scanner(System.in);

		b.name = "佐藤";
		b.account = 20150425;
		b.money = 500000;

		System.out.println("口座番号：" + b.name);
		System.out.println("口座名義：" + b.account);
		System.out.println("残高：" + b.money);
		
		System.out.println("---------------------------------");
		System.out.println("1.入金　2.引き出し(数字を入力してください)");
		int select = sc.nextInt();

		if (select == 1) {
			System.out.println("金額を入力してください-->");
			double deposit = sc.nextDouble();
			b.getDeposit(deposit);
		} else if (select == 2) {
			System.out.println("金額を入力してください-->");
			double withdraw = sc.nextDouble();
			b.getWithdraw(withdraw);
		}else {
			System.out.println("正しい数字を入力してください！");
		}

	}
}

class BankAccount {
	int account;
	String name;
	double money;

	public void getDeposit(double deposit) {
		money += deposit;
		System.out.println("残高は：" + money);
	}

	public void getWithdraw(double withdraw) {
		money -= withdraw;

		if (money < 0) {
			System.out.println("残高が不足");
		} else {
			System.out.println("残高は：" + money);
		}
	}

}
