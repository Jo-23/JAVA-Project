package ch08;

public class Person {
	
	public int height;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public Person(int height, int weight, String gender, String name, int age) {
		
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	public String showPersonInfo(){
		
		return "Ű�� " + height + "�̰� �����԰� " + weight + " ų���� " + gender + 
				"�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.";
	}
	
}