package queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//metodo de lista
//não permite mudança de ordenação
// Garante ordem de inserção
public class ExemploQueue {
	
	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<String>();
		
		filaBanco.add("Pâmela");
		filaBanco.add("Patrícia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		
		//filaBanco.clear();
		
		String clienteAguardando = filaBanco.poll();//  retorna e remove o primeiro elemente, in null return null
		
		System.out.println(clienteAguardando);
		
		System.out.println(filaBanco);
		
		String primeiroCliente = filaBanco.peek(); // retorna primeiro elemento, mas não remove, retorna null
		
		System.out.println(primeiroCliente);
		
		System.out.println(filaBanco);		
	
		
		String primeiroClienteOuErro =  filaBanco.element();// não remove, apenas retorna, add excessão
		
		System.out.println(primeiroClienteOuErro);
		
		System.out.println(filaBanco);
		
		for(String client :  filaBanco) {
			System.out.println(client);
		}
		
		Iterator<String> iteratorFilaBanco =  filaBanco.iterator();
		
		while(iteratorFilaBanco.hasNext()) {
			System.out.println("->" + iteratorFilaBanco.next());
		}
		
		System.out.println(filaBanco.size());
		
		System.out.println(filaBanco.isEmpty());
				
		
	}
	
	

}
