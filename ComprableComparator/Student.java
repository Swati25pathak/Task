package ComprableComparator;

public class Student {
	
private int id;
private String name;
private int std;
private String collegeName;
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
public int getStd() {
	return std;
}
public void setStd(int std) {
	this.std = std;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public Student(int id, String name, int std, String collegeName) {
	super();
	this.id = id;
	this.name = name;
	this.std = std;
	this.collegeName = collegeName;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", std=" + std + ", collegeName=" + collegeName + "]";
}
}
