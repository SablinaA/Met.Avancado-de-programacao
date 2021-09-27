package saboresPizza;

public class PizzaCalabresa implements Sabor {
 
	//pizza calabresa
	@Override
	public String TipoPizza() {
		System.out.println("\ncriando pizza");
		return "Calabresa";
	}
	public String toString() {
		String saida = "\n\tPizza sabor:"+TipoPizza();
		return saida;}
}