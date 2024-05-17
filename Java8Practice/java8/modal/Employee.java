package modal;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String name;
	private String department;
	private String gender;
	private int age;
	private double salary;
	private LocalDate dateofJoining;

	public Employee(int id, String name, String department, String gender, double salary, LocalDate dateofJoining,
			int age) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.gender = gender;
		this.salary = salary;
		this.dateofJoining = dateofJoining;
		this.age = age;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(LocalDate dateofJoining) {
		this.dateofJoining = dateofJoining;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + " ,department=" + department
				+ ", salary=" + salary + ", dateofJoining=" + dateofJoining + ", age=" + age + "]";
	}

}
