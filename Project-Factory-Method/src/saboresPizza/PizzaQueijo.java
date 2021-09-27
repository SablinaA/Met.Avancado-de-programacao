package saboresPizza;

public class PizzaQueijo implements Sabor {

	@Override
	public String TipoPizza() {
		System.out.println("\nCriando pizza");
		return "Queijo" ;
	}
	

	public String toString() {
		String saida = "\n\tPizza sabor:"+TipoPizza();
		return saida;}
			
	
	

}