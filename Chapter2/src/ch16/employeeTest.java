package ch16;

public class employeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmployeeName("이순신 ");
		
		System.out.println(employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");

		
		System.out.println(employee.getEmployeeName() + "님의 사번은 " + employee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
	}

}
