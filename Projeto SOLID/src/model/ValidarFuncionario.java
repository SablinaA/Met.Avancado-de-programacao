package model;

public class ValidarFuncionario extends CadastroFuncionario {
	int i;
	 
	public ValidarFuncionario(String nome, String email, String cpf) {
		super(nome, email, cpf);
		
	}

	public String contarLetras() {
		for(i = 0; i<getCpf().length();i++);
		
		
		if (i > 11) {
			return ("O cpf � inv�lido, pois cont�m mais de 11 n�meros.");
			
		}else if (i< 11) {
			return ("O cpf � inv�lido pois cont�m menos de 11 n�meros.");
		} if(i == 11) {
			return ("O cpf � v�lido.");
			
		}
		return null;
	}
	        
	
	
	public String toString() {
		String saida = "\rFuncion�rio:"+ ""+
				"\n\t" + this.getNome()+
				"\n\tE-mail:"+this.getEmail()+
				"\n\tCPF:"+this.getCpf()+
				"\n\tValidar: "+contarLetras();
		return saida;
			
				
	
}}
