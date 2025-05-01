package interfaceKadai;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s2.score - s1.score;
	}
}
