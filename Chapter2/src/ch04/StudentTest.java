package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		student studentLee = new student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStrudentInfo();
		
		student studentKim = new student();
		studentKim.studentID = 54321;
		studentKim.address = "���� ���̵�";
		studentKim.studentName = "kim";
		
		studentKim.showStrudentInfo();
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
}
