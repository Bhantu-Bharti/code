package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("welcome");
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(1,"AAA",new Department(11,"sales"));
		Employee e2 = new Employee(2,"BBB",new Department(16,"tech"));
		Employee e3 = new Employee(4,"GGG",new Department(15,"sales"));
		Employee e4 = new Employee(5,"EEE",new Department(17,"sales"));
		Employee e5 = new Employee(3,"FFF",new Department(14,"tech"));
		Employee e6 = new Employee(7,"DDD",new Department(12,"finance"));
		Employee e7 = new Employee(6,"CCC",new Department(13,"finance"));
		employees.add(e1);
		employees.add(e4);
		employees.add(e5);
		employees.add(e2);
		employees.add(e3);
		employees.add(e7);
		employees.add(e6);

		Map<String,Long> depatEmps = employees.stream().collect(Collectors.groupingBy(emp->emp.getDepartment().getName(),Collectors.counting()));

		System.out.println(depatEmps);
	}
}
class Department{
	private int id;
	private String name;

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
class Employee{
	private int id;
	private String name;
	private Department department;

	public Employee(int id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", department=" + department +
				'}';
	}
}
