package ch15;

public class TaxiTake {

	int money;
	String taxiName;
	
	public void taxiTake(String taxiName ) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	public void showTaxiInfo() {
		System.out.println(taxiName + "수입은 " + money + "원 입니다.");
	}
}
