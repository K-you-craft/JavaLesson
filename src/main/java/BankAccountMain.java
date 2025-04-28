import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		Scanner sc = new Scanner(System.in);

		b.setName("佐藤");
		b.setAccount(20150425);
		b.setMoney(500000);

		System.out.println("口座番号：" + b.getName());
		System.out.println("口座名義：" + b.getAccount());
		System.out.println("残高：" + b.getMoney());
		
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
	private int account;
	private String name;
	private double money;

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

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	

}
