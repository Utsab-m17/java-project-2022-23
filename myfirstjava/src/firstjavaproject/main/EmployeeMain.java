package firstjavaproject.main;

import firstjavaproject.data.Address;
import firstjavaproject.data.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);
		
		Address address1 = new Address("Kolkata", "India", 39, "West Bengal", "SC Aown Road", 712248);
		Employee employee1 = new Employee(1,"rock",address1);
		System.out.println(employee1);
		
		employee1.setEmpId(17);
		employee1.setEmpName("Utsab Mukherjee");
		System.out.println(employee1);

		address1.setCity("Bangalore");
		address1.setStreetName("TC Mukherjee Street");
		System.out.println(address1);
	}

}
