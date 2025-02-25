package ComprableComparator.comparable;
public class Animal implements Comparable{
private String id;
private String sound;
private String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSound() {
	return sound;
}
public void setSound(String sound) {
	this.sound = sound;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private Animal(String id, String sound, String name) {
	super();
	this.id = id;
	this.sound = sound;
	this.name = name;
}
private Animal() {
	super();
}

@Override
public int compareTo(Object o) {	
	return 0;
}

}
