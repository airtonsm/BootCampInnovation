package map;

import java.util.HashMap;
import java.util.Map;

//repete valores mas não chaves
//entrada de chave/valor
// pode ser ordenado
public class ExemploMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> mundial = new HashMap<String, Integer>();
		
		mundial.put("Brasil", 5);
		mundial.put("Alemanha", 4);
		mundial.put("Itália", 4);
		mundial.put("Uruguai", 2);
		mundial.put("Argentina", 2);
		mundial.put("França", 2);
		mundial.put("Inglaterra", 1);
		mundial.put("Espanha", 1);
		mundial.put("Chile", null);
		System.out.println(mundial);
		
		
		
		mundial.put("Brasil", 5); // pode set usado para atualizar
		
		System.out.println(mundial);
		
		// retorna a chave valor
		System.out.println(mundial.get("peru")); 
		
		// retorna chave para o objeto, boolean
		System.out.println(mundial.containsKey("Brasil"));
		
		mundial.remove("França");
		
		System.out.println(mundial);
		
		//verifica se algum chave possui a valor especificada, boolean
		System.out.println(mundial.containsValue(5));
		
		// retorna tamanho do mapa
		System.out.println(mundial.size());
		
		for(Map.Entry<String, Integer> entry : mundial.entrySet()) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}
		System.out.println("------------------");
		for(String key : mundial.keySet()) {
			System.out.println(key + "--" + mundial.get(key));
		}

		
		
	}

}
