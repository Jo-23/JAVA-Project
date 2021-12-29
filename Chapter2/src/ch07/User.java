package ch07;

public class User {

	public String passWord;
	public String userName;
	public String phoneNumber;
	public String userId;
	
	public User() {}
	public User(String passWord, String userName, String phoneNumber, String userId) {
		
		this.passWord = passWord;
		this.phoneNumber = phoneNumber;
		this.userId = userId;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return userName + "님의 아이디는 " + userId + " 비밀번호는 " + passWord + "입니다";
	}
}
