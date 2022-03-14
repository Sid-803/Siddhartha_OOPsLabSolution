package itSupport.classes_main;

//Class Employee with 5 declarations datatypes - 1 static and 4 private.
//Class Employee with 1 parametrized constructor, which accepts two arguments.
//Getter and Setter for each declaration.
public class Employee {
	public static String compname = "XYZ";
	private String firstName;
	private String lastName;
	private String department;
	private char password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public char getPassword() {
		return password;
	}
	public void setPassword(char password) {
		this.password = password;
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
	}
}