package model;

public class Contato {

	private String nome;
	private int telefone;
	private String email;
	
	public Contato(String nome, int telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Contato() {
		super();
	}

	// Gets the name of the contact.

	public String getNome() {
		return nome;		
	}

	// Sets the name of the contact.

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Gets the telephone of the contact.

	public int getTelefone() {
		return telefone;
	}

	// Sets the telephone of the contact.

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	// Gets the email of the contact.

	public String getEmail() {
		return email;
	}

	// Sets the email of the contact.

	public void setEmail(String email) {
		this.email = email;
	}		
	
}
