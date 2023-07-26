package test;

public class Employee {

	private int empId;
	private String empName;
	private int empAge;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double empSalary;
	
	public Employee(int empId, String empName, int empAge, String gender, String department, int yearOfJoining,
			double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.empSalary = empSalary;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", gender=" + gender
				+ ", department=" + department + ", yearOfJoining=" + yearOfJoining + ", empSalary=" + empSalary + "]";
	}
	
	
}