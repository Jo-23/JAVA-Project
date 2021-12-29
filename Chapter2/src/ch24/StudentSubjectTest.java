package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("영어", 70);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("영어", 50);
		studentKim.addSubject("수하", 100);
		
		studentLee.showStudentInfo();
		System.out.println("===============");
		studentKim.showStudentInfo();
			
	}
}
