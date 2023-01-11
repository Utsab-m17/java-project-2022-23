package serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serilizableUTD = 1;
	private long empId;
	private String empName;
	
	public Employee(){
		
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
	
}
