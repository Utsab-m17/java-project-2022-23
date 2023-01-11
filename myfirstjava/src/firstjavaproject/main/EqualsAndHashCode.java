package firstjavaproject.main;

import firstjavaproject.data.Employee;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		
		emp.setEmpId(1);
		emp1.setEmpId(1);
		
		emp.equals(emp1);
		
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
	}

}
