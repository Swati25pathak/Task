package exampleofoptional;

import java.util.Optional;

public class AccessingValue {

	public static void main(String[] args) {
		 Optional<String> optionalValue = Optional.of("Java 8");
  Optional.ofNullable(null);
	        // Using ifPresent to print the value if present
	        optionalValue.ifPresent(value -> System.out.println("Value is: " + value));
	        // Using orElse to provide a default value
	        String result = optionalValue.orElse("Default Value");
	        System.out.println("Result: " + result);
	}

}
