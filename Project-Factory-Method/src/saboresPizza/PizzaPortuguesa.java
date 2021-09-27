package saboresPizza;

public class PizzaPortuguesa implements Sabor {
	
	//pizza portuguesa

	@Override
	public String TipoPizza() {
		System.out.println("\ncriando pizza");
		return "Portuguesa";
	}

	
	
	public String toString() {
		String saida = "\n\tPizza sabor:"+TipoPizza();
		return saida;}

}
