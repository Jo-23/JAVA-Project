package ch24;

import java.util.ArrayList;

public class Student {

	String studentName;
	int studentId;
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	public void addSubject(String name, int score) {
		
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println("�л�" + studentName + "��" + subject.getName() + "��������"
					+ subject.getScore() +"�Դϴ�");
		}
	     System.out.println("�л�" + studentName + "�� ������ "+ total + "�Դϴ�");
	}
}
