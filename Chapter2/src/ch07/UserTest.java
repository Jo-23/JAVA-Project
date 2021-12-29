package ch07;

public class UserTest {

	public static void main(String[] args) {

		User userJo = new User();
		userJo.passWord = "ch7159";
		userJo.phoneNumber = "01049493725";
		userJo.userId = "tkdgml7159";
		userJo.userName = "¡∂ªÛ»Ò";
		
		System.out.println(userJo.showUserInfo());
		
		User usero = new User("ch2563725", "¡∂»Ø»Ò", "123456789", "art3901");
		System.out.println(usero.showUserInfo());
	}

}
