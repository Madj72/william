package jsonProject;

public class Employee {

	private String id;
	private String name;
	private String salary;

	public Employee() {
		
	}

	public Employee(String id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}
	
	
	
}
