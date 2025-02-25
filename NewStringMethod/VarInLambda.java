package NewStringMethod;

import java.util.Arrays;
import java.util.List;

public class VarInLambda {
//	// Java 8 or earlier
//	List<String> names = Arrays.asList("swati", "riya", "priya");
//	names.forEach((String name) -> System.out.println(name));

	// Java 11 and later
	List<String> names = Arrays.asList("swati", "riya", "priya");
	names.forEach((var name) -> System.out.println(name));

	
}
