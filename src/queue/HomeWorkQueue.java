package queue;

import java.util.LinkedList;
import java.util.Queue;

public class HomeWorkQueue {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("Joao");
		
		for (String ordemFila : fila) {
			System.out.println("-> " + ordemFila);
		}
		
		String primeiroFila = fila.peek(); // retorna primeiro sem remover, se vazio, null;		
		System.out.println(primeiroFila);
		System.out.println(fila);
		
		String primeiroFilaRemovendo = fila.poll();	// retorna e remove primeiro elem. fila
		System.out.println(primeiroFilaRemovendo);
		System.out.println(fila);
		
		fila.add("Daniel");
		System.out.println(fila);
		
		System.out.println(fila.size());
		
		System.out.println(fila.isEmpty());
		
		System.out.println(fila.contains("Carlos"));
		
		fila.clear();
		
		System.out.println(fila);
		
	}

}
