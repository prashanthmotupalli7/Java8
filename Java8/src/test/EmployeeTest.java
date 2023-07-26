package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static List<Employee> getEmployeeData() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "John Doe", 25, "Male", "Sales", 2018, 50000.0));
		employeeList.add(new Employee(102, "Jane Smith", 30, "Female", "Human Resources", 2015, 60000.0));
		employeeList.add(new Employee(103, "Michael Johnson", 35, "Male", "Finance", 2010, 70000.0));
		employeeList.add(new Employee(104, "Emily Brown", 28, "Female", "Marketing", 2017, 55000.0));
		employeeList.add(new Employee(105, "David Wilson", 32, "Male", "Operations", 2012, 65000.0));
		employeeList.add(new Employee(106, "Olivia Davis", 27, "Female", "IT", 2019, 52000.0));
		employeeList.add(new Employee(107, "Daniel Anderson", 33, "Male", "Research", 2014, 62000.0));
		employeeList.add(new Employee(108, "Sophia Martinez", 29, "Female", "Customer Service", 2016, 58000.0));
		employeeList.add(new Employee(109, "Matthew Taylor", 31, "Male", "Engineering", 2013, 68000.0));
		employeeList.add(new Employee(110, "Ava Clark", 26, "Female", "Product Management", 2020, 53000.0));

		return employeeList;

	}

	// print all departments in the organization
	public static void main(String[] args) {

		List<Employee> employees = getEmployeeData();

		// Male and female Employee acount
		Map<String, Long> genderCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCount);

		List<String> deptList = employees.stream().map(e -> e.getDepartment()).collect(Collectors.toList());
		System.out.println(deptList);

		// Employee count of each department
		Map<String, Long> deptEmpCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		for (Map.Entry<String, Long> entry : deptEmpCount.entrySet())
			System.out.println("DEPARTMENT - " + entry.getKey() + " : " + "COUNT OF EMP - " + entry.getValue());

		// Increase the salary of employee by 30 percent whose age is greater than 25
		employees.stream().filter(e -> e.getEmpAge() > 25).forEach(e -> {
			double increaseSalary = e.getEmpSalary() * 1.3;
			e.setEmpSalary(increaseSalary);
			System.out.println("EMP_ID: " + e.getEmpId() + " , " + "EMP_SAL: " + e.getEmpSalary());
		});
		
		//employee salary in descending order
		System.out.println("------------SALARY IN DECSCENDING ORDER------------");
		employees.sort(Comparator.comparingDouble(Employee::getEmpSalary).reversed());
		/*
		 * list<Employee> top3Emp=
		 * employees.sort(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
		 * .limit(3).collect(Collectors.toList());
		 */

		for (Employee emp : employees) 
			System.out.println(emp);

	}
}
