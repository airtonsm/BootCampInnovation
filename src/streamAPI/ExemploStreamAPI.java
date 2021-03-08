package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Manipulação de coleções com o paradigma funcional de forma paralela
// Imutável - Não altera a coleção origem, sempre cria uma nova coleção
// perfomace e ordenação
public class ExemploStreamAPI{

	public static void main(String[] args) {

		List<String> estudantes = new ArrayList<String>();
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcela");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");

		// retorna contagem de elementos do stream
		System.out.println("Contagem: " + estudantes.stream().count());

		// retorna nome com maior numero de letras
		System.out.println("Maior número de letras: " 
		+ estudantes.stream().max(Comparator.comparingInt(String::length)));

		// retorna nome com menor numero de letras
		System.out.println("Menor número de letras: " 
		+ estudantes.stream().min(Comparator.comparingInt(String::length)));

		
		System.out.println("Nomes com a letra 'r' " + estudantes.stream().
				filter((estudante) -> estudante.toLowerCase().
						contains("r")).collect(Collectors.toList()));
		
		
		System.out.println("Retorna Nome e quantidade de letras: " +
		estudantes.stream().map(estudante -> estudante.concat(" - ").
				concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		System.out.println("--------peek----------------");
		// peek exibe cada elemento no console, depois retorna outra coleção
		System.out.println("Peek::Retorna os elementos e lista: " + estudantes.stream().
				peek(System.out::println).collect(Collectors.toList()));
		
		//forEach retorna somente elementos e não a lista
		System.out.println("--------------------");
		System.out.println("ForEach::Retorna somente os elementos: ");
		estudantes.stream().forEach(System.out::println);
		
		//allMatch: Boolean, retorna elementos  somente se todos os elementos forem true.
		System.out.println("------allMatch------------");
		System.out.println(estudantes.stream().allMatch((elementos) -> elementos.contains("w")));
		
		
		//anyMatch: Boolean, retorna elementos  somente se um dos elementos forem true.
		System.out.println("------anyMatch------------");
		System.out.println(estudantes.stream().anyMatch((elementos) -> elementos.contains("a")));

		// noneMatch: retorna true se nenhum elemento tiver a minúsculo.
		System.out.println("------noneMatch------------");
		System.out.println(estudantes.stream().noneMatch((elementos) -> elementos.contains("a")));
		
		System.out.println("FindFirst : retorna primeiro elemento da lista se existir");
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("Operações encadeadas: ");
		System.out.println(estudantes.stream().
				peek(System.out::println).
				map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter((estudante)
						-> estudante.toLowerCase().contains("r"))
//				.collect(Collectors.toList()));
			//.collect(Collectors.joining(", ")));
			//	.collect(Collectors.toSet()));
			.collect(Collectors.groupingBy(estudante -> 
			estudante.substring(estudante.indexOf("-") + 1))));
				
		
	}

}
