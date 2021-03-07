package optionals;

import java.util.Optional;

public class OptionalConditional {
	
	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.empty()
				;
		
		System.out.println(optionalString.isEmpty()); // true se vazio
		System.out.println(optionalString.isPresent()); // true se presente
		
		if(optionalString.isPresent()) {
		System.out.println(optionalString.get());
		}
	}

}
