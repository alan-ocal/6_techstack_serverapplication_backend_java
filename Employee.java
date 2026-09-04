package com.student.objectequality_equals_hashCode;

import java.util.Objects;

/**
 * 
 */
public class Employee {

	private String name;
	private Integer id;
	private String department;
	
	private static Integer hashcodeValue;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return Objects.equals(name, employee.name) &&
			   Objects.equals(id, employee.id) && 
			   Objects.equals(department, employee.department);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}
