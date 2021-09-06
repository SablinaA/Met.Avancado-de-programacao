package model;
public class CadastroFuncionario {
	
	//atributos
	private String nome, email;
	private String cpf;
	
	
	// costrutor
	public CadastroFuncionario( String nome,String email, String cpf) {
		this.setNome(nome);
		this.setEmail(email);
		this.setCpf(cpf);}
	
	
	// get and set
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	

}





