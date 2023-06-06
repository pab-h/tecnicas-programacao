package controlador;

public class Aluno {
	private String nome;
	private String cpf;
	private String matricula;
	private String vertente;

	public Aluno() {
	
	}
	
	public Aluno(String nome, String cpf, String matricula, String vertente) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.vertente = vertente;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getVertente() {
		return this.vertente;
	}

	public void setVertente(String vertente) {
		this.vertente = vertente;
	}
	
}
