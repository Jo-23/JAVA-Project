package ch15;

public class Taxi {

	String name;
	int money;
	
	public Taxi(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(TaxiTake taxi) {
		
		taxi.take(10000);
		taxi.money -= 10000;
	}
	public void showInfo() {
			System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
		}
}
