package model;


public class Pessoa {

	private String nome;
	protected int idade;
	protected long telefone;
	
	
	
	public Pessoa(String nome,int idade, long telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public  int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public long getTelefone() {
		return telefone;
	}


	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}


	public String toString() {
		String saida = "\t\nNome:"+ getNome()+
				"\tTelefone:"+ getTelefone() ;
		
						
		return saida;}


	

		
	}

	

