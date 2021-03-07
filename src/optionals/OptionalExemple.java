package optionals;

import java.util.Optional;

//Tratamento para valores que podem ser nulos
// possui dois valores: presente/ vazio
// permite executa operações com objetos vazios, sem ocorrer NullPointExceptions
public class OptionalExemple {

	public static void main(String[] args) {

		Optional<String> optionalString = Optional.of("Valor Presente");

		System.out.println("Valor optional que está presente:");
		// recebe dois argumentos, veridica se está presente ou vazio
		optionalString.ifPresentOrElse(System.out::println, 
				() -> System.out.println("Null = não está presente:"));
		
		
		System.out.println("-------------------");
		// retorna um option vazio, não presente
		// constroi de acordo com o que passar para o argumento
		//chama um empty
		Optional<String> optionalNull = optionalString.ofNullable(null);
		
		
		System.out.println("valor optional que não está presente:");
		optionalNull.ifPresentOrElse(System.out::println, 
				() -> System.out.println("Null = não está presente"));
		
		
		

	}

}
