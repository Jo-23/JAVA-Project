package ch15;

public class TaxiTest {

	public static void main(String[] args) {

		Taxi st = new Taxi("Edward", 20000);
		TaxiTake ta = new TaxiTake();
		st.money = 10000;
		ta.taxiName = "�� ������ ��� ";
		ta.money = 10000;
		
		st.showInfo();
		ta.showTaxiInfo();
	}

}
