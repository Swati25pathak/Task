package exampleofoptional;

import java.util.Optional;

public class OptionalException {

	public static void main(String[] args) {
		 Optional<String> optionalValue = Optional.empty();

	        // Using orElseThrow to throw an exception if the value is absent
	        try {
	            String value = optionalValue.orElseThrow(() -> new RuntimeException("Value not present!"));
	        } catch (RuntimeException e) {
	            System.out.println(e.getMessage()); // Prints: Value not present!
	        }

	}

}
