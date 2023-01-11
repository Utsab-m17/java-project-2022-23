package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(102, "Laura", "Jones", 28, 10000.0);
		Employee emp2 = new Employee(109, "Nicolas", "Jones", 26, 8000.0);
		Employee emp3 = new Employee(105, "Maximus", "Otamendi", 27, 10300.0);
		Employee emp4 = new Employee(101, "Laura", "Anderson", 29, 14000.0);
		Employee emp5 = new Employee(107, "John", "Bakes", 28, 10000.0);
		
		List empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		
		Collections.sort(empList, new EmpIdComparator());
		
		System.out.println(empList);
	}

}
