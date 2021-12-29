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
		
		return( "주문 접수 번호 " + orderNumber +  
		 "\n주문 핸드폰 번호 " + orderPhoneNumber +
		 "\n주문 집 주소 " + address +
		 "\n주문 날짜 " + orderday +
		 "\n주문 시간 " + orderTime +
		 "\n주문 가격 " + Price +
		 "\n메뉴 번호 " + number);
	}
}
