package ch08;

public class Order {

	public String orderNumber;
	public String orderPhoneNumber;
	public String address;
	public double orderday;
	public int orderTime;
	public int Price;
	public int number;
	
	public Order() {}
	
	public Order(String orderNumber, String orderPhoneNumber, String address, double orderday,
			int orderTime, int Price, int number) {
		
		this.address = address;
		this.number = number;
		this.orderday = orderday;
		this.orderNumber = orderNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderTime =orderTime;
		this.Price = Price;
	}
	public String showOrderInfo() {
		
		return( "�ֹ� ���� ��ȣ " + orderNumber +  
		 "\n�ֹ� �ڵ��� ��ȣ " + orderPhoneNumber +
		 "\n�ֹ� �� �ּ� " + address +
		 "\n�ֹ� ��¥ " + orderday +
		 "\n�ֹ� �ð� " + orderTime +
		 "\n�ֹ� ���� " + Price +
		 "\n�޴� ��ȣ " + number);
	}
}
