package ch18;

public class Car {

	private static int SerialNum = 1001;
	private int CarNum;
	
	public Car() {
		SerialNum++;
		CarNum = SerialNum;
	}
	public int getCarNum() {
		return CarNum;
	}
	public void setCarNum(int carNum) {
		CarNum = carNum;
	}
	
		
}
