package model;

import java.util.ArrayList;

public class Dados {
	String i;
	
		public Dados(String i) {
			this.i =i;
		}

		public static ArrayList<String> add(String i) {
			ArrayList<String> lista = new ArrayList<String>();

			lista.add(i);
			return lista;
						
		}

		
		
		public String toString() {
			String saida =  "\nListar Funcionários:"+add(i);
			return saida;
				
			
}

		}
			
