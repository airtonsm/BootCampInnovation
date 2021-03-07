package set;

import java.util.TreeSet;

// arvore binária
//Ordem Alfabétic
//a ordenação prejudica a perfomace
public class ExemploTreeSet {

	public static void main(String[] args) {

		TreeSet<String> treeCapitais = new TreeSet<String>();

		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");

		System.out.println(treeCapitais);

		// retorna a primeira capital no topo da árvore
		System.out.println(treeCapitais.first());

		// retorna a última capital no topo da árvore
		System.out.println(treeCapitais.last());

		// retorna a primeira capital a abaixo da capital parametrizada
		System.out.println(treeCapitais.lower("Florianópolis"));

		// retorna a primeira capital a acima da capital parametrizada
		System.out.println(treeCapitais.higher("Florianópolis"));

		// Retorna a primeira capital no topo da árvore, removendo do set
		System.out.println(treeCapitais.pollFirst());
		System.out.println(treeCapitais);
		
		// Retorna a última capital no topo da árvore, removendo do set
		System.out.println(treeCapitais.pollLast());
		System.out.println(treeCapitais);

	}

}
