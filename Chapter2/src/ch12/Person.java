package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		
		//int num = 10; �ȵ�
		//name = "test"; �ȵ�
		this("no name", 1); //����
		//name = "aaa";   ����
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public void ShowPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() {
		return this;
	}
	public static void main(String[] args) {
		Person person = new Person();
		person.ShowPerson();
		System.out.println(person);
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
