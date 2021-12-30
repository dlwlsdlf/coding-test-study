import java.util.*;

class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}


	//정렬 기준은 점수가 낮은 순서
	@Override
	public int compareTo(Student other) {
		if (this.score<other.score) {
			return -1;
		} 
		return 1;
	}

	
		
}

public class Sort_2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		//n명의 학생 정보를 입력받아 리스트에 저장
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int score = in.nextInt();
			students.add(new Student(name, score));
		}
		
		Collections.sort(students);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName() + " ");
		}
	}
}
