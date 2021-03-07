package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");
		nomes.add("João");		
		
		System.out.println(nomes);
		
		nomes.addAll(nomes);
		
		System.out.println(nomes);
		
		nomes.set(2, "Larissa");
		
		System.out.println(nomes);

		Collections.sort(nomes);
		
		nomes.set(2, "Wesley");
		
		System.out.println(nomes);
		
		for(String nomeLista : nomes) {
			System.out.println("--->" + nomeLista);
		}
		
		Iterator<String> iterator =  nomes.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println("->" + iterator.next());
			
		}
		
		nomes.remove(4);
		
		System.out.println(nomes);
		
		nomes.remove("Wesley");
		
		System.out.println(nomes);
		
		String nome = nomes.get(3);
		
		nomes.clear();
		
		int posicao = nomes.indexOf("Wesley");
		
		System.out.println(posicao);
		
		System.out.println(nome);
		
		int tamanho = nomes.size();
		
		System.out.println(tamanho);
		
		nomes.remove("Larissa");
		
		tamanho = nomes.size();
		
		System.out.println(tamanho);
		
		boolean temAnderson =  nomes.contains("Anderson");
		
		System.out.println(temAnderson);
		
		temAnderson =  nomes.contains("Fernando");
		
		System.out.println(temAnderson);
		
		boolean listEstaVazia =  nomes.isEmpty();
		
		System.out.println(listEstaVazia);
		
		nomes.clear();
		
		listEstaVazia =  nomes.isEmpty();
		
		System.out.println(listEstaVazia);
		
		
		
		
	}

}
