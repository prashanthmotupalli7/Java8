package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Student {
		String name;
		int age;
		
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

 }
	
	class AgeComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getAge()-o2.getAge();		
					}

	}


	public class ComparatorExe {
	public static void main(String[] args) {
		   List<Student> students = new ArrayList<>();
	        students.add(new Student("John", 20));
	        students.add(new Student("Alice", 18));
	        students.add(new Student("Bob", 22));
	        
	        Collections.sort(students, new AgeComparator());
	        
	        for(Student student:students)
	        	System.out.println(student);
	}
   
	}
 