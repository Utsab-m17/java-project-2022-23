package collections.comparator;

public class Employee {
	private Integer empId;
	private String fName;
	private String lName;
	private Integer age;
	private Double salary;

	public Employee() {
		
	}

	public Employee(Integer empId, String fName, String lName, Integer age, Double salary) {
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", salary="
				+ salary + "]";
	}

}

