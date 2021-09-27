package saboresPizza;

public class PizzaFrango implements Sabor {

	@Override
	public String TipoPizza() {
		System.out.println("Criando pizza");
		return "Frango";
	}


	public String toString() {
		String saida = "\n\tPizza sabor:"+TipoPizza();
		return saida;}
	


	

	
}
