package supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class EmployeeSupplierDemo {

	public static void main(String[] args) {
		//passing contructor reference to supplier factory
		Employee emp = supplierFactory(Employee::new);
		System.out.println(emp);
		
		//Lambda Expression
		Supplier<? extends Employee> s = ()->new Employee("Rakesh");
		Employee emp1 = supplierFactory(s);
		System.out.println(emp1);
		
		Supplier<? extends Employee> s1 = ()->new Employee("Utsab",BigDecimal.TEN, LocalDate.now());
		Employee emp2 = supplierFactory(s1);
		System.out.println(emp2);
	}

	public static Employee supplierFactory(Supplier<? extends Employee> s1) {
		Employee employee= s1.get();
		if(employee.getName() == null || "".equals(employee.getName())) {
			employee.setName("default");
			employee.setSalary(BigDecimal.ONE);
			employee.setStartDate(LocalDate.of(2016, 10, 15));
		}else if(employee.getName() != null && employee.getSalary() == null && employee.getStartDate() == null) {
			employee.setSalary(BigDecimal.ONE);
			employee.setStartDate(LocalDate.of(2016, 10, 15));
		}
	

		return employee;
	}



}
