package set;

import java.util.LinkedHashSet;

//respeita a ordem que se adiciona
public class ExemploLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		
		System.out.println(sequenciaNumerica);
		
		sequenciaNumerica.remove(4);
		
		System.out.println(sequenciaNumerica); //remove por objeto
		
		System.out.println(sequenciaNumerica.size());
		
		
		
	}

}
