package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		student studentLee = new student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStrudentInfo();
		
		student studentKim = new student();
		studentKim.studentID = 54321;
		studentKim.address = "대전 중촌동";
		studentKim.studentName = "kim";
		
		studentKim.showStrudentInfo();
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
}
