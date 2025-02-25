package exampleofoptional;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		        Optional<String> presentOptional = Optional.of("Hello, Optional!");
		        
		       
		        Optional<String> emptyOptional = Optional.empty();

		        String nullableValue = null;
		        Optional<String> optionalFromNullable = Optional.ofNullable(nullableValue);
		        
		        System.out.println("Present Optional: " + presentOptional.get());
		        System.out.println("Empty Optional is present: " + emptyOptional.isPresent());
		        System.out.println("Nullable Optional is present: " + optionalFromNullable.isPresent());
		    }
		


	}


