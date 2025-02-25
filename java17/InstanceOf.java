package java17;

public class InstanceOf {
public static void main(String[] args) {
	Object obj = "Hello, world!";
//before java 17
	if (obj instanceof String) {
	    String str = (String) obj;  // Explicit cast required
	    System.out.println(str.toUpperCase());
	}

	Object obj2 = "Hello, world!";
//after java 17
	if (obj2 instanceof String str) {  
	    System.out.println(str.toUpperCase());  
	}

}
}
