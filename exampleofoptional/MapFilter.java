package exampleofoptional;

import java.util.Optional;

public class MapFilter {
	
	
	public static void main(String[] args) {	

	 Optional<String> optionalName = Optional.of("Alice");
	
	        // Using map to transform the value
	        Optional<String> upperCaseName = optionalName.map(String::toUpperCase);
	        upperCaseName.ifPresent(name -> System.out.println("Uppercase Name: " + name));
	
	        
	        // Using filter to check a condition
	        Optional<String> filteredName = optionalName.filter(name -> name.startsWith("A"));
	        filteredName.ifPresent(name -> System.out.println("Filtered Name: " + name));
	        
	      
	        
	}
}

