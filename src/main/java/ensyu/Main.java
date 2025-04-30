package ensyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//演習問題１
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " , ");
		}

		System.out.println();
		System.out.println("----------------------------------------");

		//演習問題２
		List<String> fruit = new ArrayList<String>();
		fruit.add("リンゴ");
		fruit.add("みかん");
		fruit.add("ぶどう");

		for (String str : fruit) {
			System.out.print(str + "\t");
		}

		System.out.println();
		System.out.println("----------------------------------------");

		//演習問題３
		double score = 95;
		boolean submittedReport = false;

		if (score >= 60 || submittedReport == true) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

		System.out.println("----------------------------------------");

		//演習問題４
		if (score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

		System.out.println("----------------------------------------");

		//演習問題５
		int x = 3;
		double y = x;
		double a = 3.14;
		int b = (int) a;
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);

		System.out.println("----------------------------------------");

		//演習問題６
		List<Person> person = Arrays.asList(
				new Person("東京", 150, 250),
				new Person("大阪", 120, 180),
				new Person("京都", 80, 120),
				new Person("福岡", 50, 80),
				new Person("札幌", 40, 60));

		int total = 0;
		for (Person p : person) {
			double sum = p.getSum();
			total += p.getSum();
		}

		System.out.println("全都市の総観光客数:" + total + "人");

		System.out.println();
		System.out.println("観光客数が100万人を超える都市:");

		for (Person p : person) {
			if (p.getSum() > 100) {
				System.out.print(p.getCity() + " ");
			}
		}

		System.out.println();
		System.out.println();
		double max = 0;
		System.out.println("外国人観光客の割合が最も高い都市:");
		for (Person p : person) {
			if (p.getPercent() > max) {
				max = p.getPercent();
			}
		}

		for (Person p : person) {
			if (p.getPercent() == max) {
				System.out.println(p.getCity() + "(" + max * 100 + "% )");
			}
		}

		System.out.println("----------------------------------------");

		//演習問題７
		List<Employee> employees = Arrays.asList(
				new Employee("山田太郎", "営業部", 30, 5),
				new Employee("鈴木花子", "開発部", 35, 3),
				new Employee("佐藤一郎", "営業部", 28, 1),
				new Employee("田中美咲", "人事部", 32, 4),
				new Employee("中村健一", "開発部", 38, 7)

		);
		
		for(Employee e : employees) {
			int count = 0;
			double sum =0;
			
			if(e.getDepartment().equals("営業部")) {
				count++;
				sum += e.getSalary();
			}else if(e.getDepartment().equals("開発部")) {
				count++;
				sum += e.getSalary();
			}
		}
		
		
		
		

	}
}
