import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("satou");
		s1.setScore(80);
		
		Student s2 = new Student();
		s2.setName("tanaka");
		s2.setScore(90);
		
		Student s3  = new Student();
		s3.setName("sakura");
		s3.setScore(75);
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		
		double total = 0;
		
		for(Student st : students) {
			total += st.getScore();
		}
		
		double avg = total / students.size();
		
		System.out.println("成績の平均値は：" + avg);
		
	}

}

class Student{
	String name;
	double score;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
