package view;

import model.PizzaFactory;
import saboresPizza.Sabor;

public class GerarPizza {

	public static void main(String[] args) {
			
	// testando a aplicação
		
	PizzaFactory factory = new PizzaFactory();
	Sabor pizza = factory.GerarPizza("frango");
	System.out.print( pizza);
		
	PizzaFactory factory2 = new PizzaFactory();
	Sabor pizza2 = factory2.GerarPizza("calabresa");
	System.out.print( pizza2);
	
	PizzaFactory factory3 = new PizzaFactory();
	Sabor pizza3 = factory3.GerarPizza("portuguesa");
	System.out.print( pizza3);
	
	PizzaFactory factory4 = new PizzaFactory();
	Sabor pizza4 = factory4.GerarPizza("queijo");
	System.out.print( pizza4);
		
		
			}
	
}
		

