package ch16;

public class employeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmployeeName("�̼��� ");
		
		System.out.println(employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");

		
		System.out.println(employee.getEmployeeName() + "���� ����� " + employee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� ����� " + employeeKim.getEmployeeId());
	}

}
