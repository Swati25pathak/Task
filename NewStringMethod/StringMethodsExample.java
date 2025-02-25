package NewStringMethod;


	public class StringMethodsExample {
	    public static void main(String[] args) {
	        String str1 = "   ";  
	        String str2 = "Hello, World!";
	        String str3 = "";

	        System.out.println(str1.isBlank());  // true
	        System.out.println(str2.isBlank());  // false
	        System.out.println(str3.isBlank());  // true
	        
	        
	        
	        String str = "   \u2000Hello, Java!  \u2000";  // The characters \u2000 are Unicode space characters.
	        System.out.println("Before strip: '" + str + "'");
	        System.out.println("After strip: '" + str.strip() + "'");
	        
	        String str = "Java ";
	        System.out.println(str.repeat(3));  // Repeat "Java " three times
	        String sentence = "I love Java. Java is fun.";
	        String modifiedSentence = sentence.replaceAll("Java", "Python");
	        System.out.println(modifiedSentence);  // Replace all "Java" with "Python"
	    
	    }
	}


