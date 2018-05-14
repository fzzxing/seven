package seven;

class EmployeeTest{
	
	public static void main(String[]args) {
		Employee e=new Employee();
		
		e.setEmployeeId("65233");
		e.setName("wt");
		e.setAge(23);
		e.show();
	}
}
 class Employee
{
	private String employeeId;
	
	private String name;
	
	private int age;
	
	public Employee() {}

	public void setEmployeeId(String employeeId) {
		
		this.employeeId=employeeId;
	}
	public String getEmploteeId() {
		return employeeId;
	}
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public int getAge() {
		
		return age;
	}
	public void show() {
		
		System.out.println("employeeId:"+employeeId+"name:"+name+"age"+age);
	}
}

