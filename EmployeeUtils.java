package com.student.java_eight;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.student.java_eight.Employee;

/**
 * filterByDepartment() method "filters a list of Employee objects based on  their department"
 *  it uses collect() method of type Stream.
 */

public class EmployeeUtils {
	public static List<Employee> filterByDepartment(List<Employee> employees, String department) {
		return employees.stream().filter(employee -> Objects.equals(employee.getDepartment(), department))
				.collect(Collectors.toList());
	}

}
