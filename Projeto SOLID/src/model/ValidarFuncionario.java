package model;

public class ValidarFuncionario extends CadastroFuncionario {
	int i;
	 
	public ValidarFuncionario(String nome, String email, String cpf) {
		super(nome, email, cpf);
		
	}

	public String contarLetras() {
		for(i = 0; i<getCpf().length();i++);
		
		
		if (i > 11) {
			return ("O cpf é inválido, pois contém mais de 11 números.");
			
		}else if (i< 11) {
			return ("O cpf é inválido pois contém menos de 11 números.");
		} if(i == 11) {
			return ("O cpf é válido.");
			
		}
		return null;
	}
	        
	
	
	public String toString() {
		String saida = "\rFuncionário:"+ ""+
				"\n\t" + this.getNome()+
				"\n\tE-mail:"+this.getEmail()+
				"\n\tCPF:"+this.getCpf()+
				"\n\tValidar: "+contarLetras();
		return saida;
			
				
	
}}
