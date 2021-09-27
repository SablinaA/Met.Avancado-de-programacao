package model;
import saboresPizza.PizzaCalabresa;
import saboresPizza.PizzaFrango;
import saboresPizza.PizzaPortuguesa;
import saboresPizza.PizzaQueijo;
import saboresPizza.Sabor;


public class PizzaFactory {

	
	public Sabor GerarPizza(String tipo) {

		Sabor pizza = null;
		
		//realizando a verifica��o do tipo da pizza e inst�nciando
		switch(tipo) {
		
		case "calabresa":
			pizza = new PizzaCalabresa();			
			break;
		
		case "queijo":
			pizza = new PizzaQueijo();
			
			break;
		
		case "portuguesa":
			pizza = new PizzaPortuguesa();
			
			break;
			
		case "frango":
			pizza =new PizzaFrango();
			
			break;			
		
		}
		return pizza;
				
	}}


	
