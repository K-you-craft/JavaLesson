package ensyu;

public class Employee {
	String name ;
	String department;
	double salary;
	int years;
	
	
	public Employee(String name, String department, double salary, int years) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.years = years;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	
}
