package ComprableComparator;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private long phoneNumber;
private String email;
private int sal;
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
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Employee(int id, String name, long phoneNumber, String email, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", sal="
			+ sal + "]";
}
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.getSal()-o.getSal();
}

}
