package model;

import saboresPizza.Sabor;

public class Pizzaria {

		private Sabor pizza;

		public void criarPizza(String sabor) {

			// instanciando o sabor da pizza
			PizzaFactory factory = new PizzaFactory();
			pizza = factory.GerarPizza(sabor);
		}



	}


