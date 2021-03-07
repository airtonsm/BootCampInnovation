package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//Não garante ordem
public class ExemploTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> treeCapitais = new TreeMap<String, String>();

		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florianópolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "São Paulo");
		treeCapitais.put("BH", "Belo Horizonte");

		System.out.println(treeCapitais);

		// Retorna a primeira capital no topo da árvore
		System.out.println(treeCapitais.firstKey());

		// Retorna a última capital no topo da árvore
		System.out.println(treeCapitais.lastKey());

		// Retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));

		// Retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(treeCapitais.higherKey("SC"));
		
		// retorna e remove primeiro valor da árvore
		Map.Entry<String, String> fistEntry = treeCapitais.pollFirstEntry();
		// retorna e remove último valor da árvore
		Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
		
		System.out.println("primeiro valor: " + fistEntry.getKey() + " - " + fistEntry.getValue());
		System.out.println("Último valor: " + lastEntry.getKey() + " - " + lastEntry.getValue());
		
		System.out.println(treeCapitais);
		
		Iterator<String> iterator = treeCapitais.keySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------");
		for(String capital : treeCapitais.keySet()) {
			System.out.println(capital);
		}
		
		System.out.println("-----------");
		for(Map.Entry<String, String> entry : treeCapitais.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	}

}
