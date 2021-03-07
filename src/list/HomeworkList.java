package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("Joao");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		nomes.set(2, "Roberto");
		
		System.out.println(nomes);
		
		System.out.println(nomes.get(0));
		
		nomes.remove(3);
		
		System.out.println(nomes);
		
		nomes.remove("Joao");
		
		System.out.println(nomes);
		
		System.out.println("Tamanho da lista é " + nomes.size());
		
		System.out.println(nomes.contains("Juliana"));
		
		List<String> novosNomes =  new ArrayList<String>();
		
		novosNomes.add("Ismael");
		novosNomes.add("Rodrigo");
		
		novosNomes.addAll(nomes);
		
		System.out.println(novosNomes);
		
		System.out.println(novosNomes.isEmpty());
		
	}

}
