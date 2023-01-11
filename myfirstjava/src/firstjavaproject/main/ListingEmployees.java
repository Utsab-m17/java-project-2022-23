package firstjavaproject.main;

import java.util.ArrayList;
import java.util.List;

import firstjavaproject.data.Employee;

public class ListingEmployees {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.setEmpId(11);
		emp2.setEmpId(002);
		emp3.setEmpId(119);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp3);
		list.add(emp1);
		list.add(emp2);
		
		for(Employee empList : list) {
			System.out.print(empList.getEmpId()+ " ");
		}
		
		

	}

}
