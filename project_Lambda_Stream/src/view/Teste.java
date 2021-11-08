package view;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Pessoa;

public class Teste {

	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> Lista = new ArrayList<>();
		
		Lista.add(new Pessoa("Angela", 11, 839816806));
		Lista.add(new Pessoa("Marcos", 20, 702469888));
		Lista.add(new Pessoa("Cíntia", 19, 874596858));
		Lista.add(new Pessoa("Maria", 14, 489571823));
		Lista.add(new Pessoa("Odette", 32, 95246978));
		Lista.add(new Pessoa("Layla", 22, 756478913));
		Lista.add(new Pessoa("Cecilion", 18, 85236987));
		Lista.add(new Pessoa("Sakura", 9, 842395716));
		Lista.add(new Pessoa("Lúcio", 36, 74859625));
		Lista.add(new Pessoa("Cláudio", 17, 32564125));
		
		// Apresenta todas as pessoas maiores de 18 anos e seu telefone
		List<Pessoa> anos= Lista.stream()			
				.filter(c ->(c.getIdade() > 17))
				 .collect(Collectors.toList());
		System.out.println("Nomes de pessoas maiores de idade e seu telefone" + anos);
		
		
		// Apresentar todas as pessoas com a inicial "C"
		List<Pessoa> inicial = Lista.stream()			
				.filter(c -> (c.getNome().startsWith("C")))
				.collect(Collectors.toList());
				
		System.out.println("\rNomes que começam com a inicial 'C'"+inicial);
		
		}
		
	}
