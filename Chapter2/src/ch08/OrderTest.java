package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.address = "서울시 강남구 역삼동 111-333";
		order.number = 0003;
		order.orderday = 20210804;
		order.orderNumber = "202011020003";
		order.orderPhoneNumber = "01049493725";
		order.orderTime = 130258;
		order.Price = 25000;
		
		System.out.println(order.showOrderInfo());
	}

}
