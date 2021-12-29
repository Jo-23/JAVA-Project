package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		
		//int num = 10; ¾ÈµÊ
		//name = "test"; ¾ÈµÊ
		this("no name", 1); //°¡´É
		//name = "aaa";   °¡´É
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
