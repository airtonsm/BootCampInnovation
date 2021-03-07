package optionals;

import java.util.Optional;

public class HomeWorkOptional {
	
	public static void main(String[] args) {
		
		Optional<String> option =  Optional.of("Valor presente");
		
		option.ifPresentOrElse(System.out::println, () -> System.out.println("Valor Não presente"));
		
		System.out.println("------------------");
		
		Optional<String> optionNull =  Optional.ofNullable("Aqui aceita null");
		optionNull.ifPresentOrElse(System.out::println, 
				() -> System.out.println("Valor Não presente"));
	}
	
	

}
