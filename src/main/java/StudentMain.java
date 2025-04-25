public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "佐藤";
		
		s1.score = new double[3];
		
		s1.score[0] = 80; 
		s1.score[1] = 90; 
		s1.score[2] = 50; 
		
		s1.getAvg();
	}

}

class Student{
	String name;
	double[] score;
	
	public void getAvg() {
		int sum = 0;
		double avg;
		
		for(int i = 0; i < score.length ; i++) {
			sum += score[i];
		}
		
		avg = (double)sum/score.length;
		
		System.out.println(name + "の成績の平均値は：" + avg);
	}
}
