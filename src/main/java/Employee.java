
public class Employee {
	String ID;
	String name;
	double money;

	public void raiseSalary(double percent) {
		money += percent;

		System.out.println("昇給後の給与は：" + money);
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if(ID.equals(other.ID)) {
			return true;
		}else {
			return false;
		}
	}
}
