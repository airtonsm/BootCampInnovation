package optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionPrimitivosExemplo {
	
	public static void main(String[] args) {
		
		System.out.println("***Valor inteiro optional***");
		OptionalInt.of(12).ifPresent(System.out::println);
		
		System.out.println("***Valor Double optional***");
		OptionalDouble.of(55.2).ifPresent(System.out::println);
		
		System.out.println("***Valor Long optional***");
		OptionalLong.of(23L).ifPresent(System.out::println);
		
	}

}
