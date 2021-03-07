package optionals;

import java.util.Optional;

//Tratamento para valores que podem ser nulos(opcionais)
// possui dois valores: presente/ vazio
// permite executa operações com objetos vazios, sem ocorrer NullPointExceptions
public class OptionalExemple {

	public static void main(String[] args) {
		
		// se temos certeza que existe um valor
		// of receber o tipo o option, recebe o valor
		Optional<String> optionalString = Optional.of("Valor Presente");

		System.out.println("Valor optional que está presente:");
		// deve ser executada se o valor está presentes
		// recebe dois argumentos, veridica se está presente ou vazio
		optionalString.ifPresentOrElse(System.out::println, 
				() -> System.out.println("Null = não está presente:"));
		
		
		System.out.println("-------------------"  );
		// se pode ser null
		// retorna um option vazio, não presente
		// constroi de acordo com o que passar para o argumento
		//controi um empty
		Optional<String> optionalNull = optionalString.ofNullable(null);		
		System.out.println("valor optional que não está presente:");
		optionalNull.ifPresentOrElse(System.out::println, 
				() -> System.out.println("Null = não está presente"));
		
		//construi do zero
		//empty add algum valor para o objeto não ficar vazio
		Optional<String> emptyOptional = Optional.empty();		
		System.out.println("Valor optional que não está presente");
		emptyOptional.ifPresentOrElse(System.out::println, 
				() -> System.out.println("empty = não está presente"));
		
		Optional<String> optionNullErro = Optional.of(null);
		
		System.out.println("Valor opcional que lança erro NullPointException");
		optionNullErro.ifPresentOrElse(System.out::println, 
				() -> System.out.println("erro = não está presente"));
	}

}
