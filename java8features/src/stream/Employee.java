package stream;

public class Employee {
	private int empId;
	private String nameString;
	private Double salary;
	private String departmentString;
	
	public Employee(int empId, String nameString, Double salary, String departmentString) {
		this.empId = empId;
		this.nameString = nameString;
		this.salary = salary;
		this.departmentString = departmentString;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartmentString() {
		return departmentString;
	}
	public void setDepartmentString(String departmentString) {
		this.departmentString = departmentString;
	}
	
	
	@Override
	public String toString() {
		return "[empId=" + empId + ", nameString=" + nameString + ", salary=" + salary + ", departmentString="
				+ departmentString + "]";
	}

}
