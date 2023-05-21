package questao5;

public class Contato {
	private int codigo;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private String observacao;
	
	private boolean isCodigo(int codigo) {
		return codigo >= 1000 && codigo <= 9999;
	}
	
	private boolean isTelefone(String telefone) {
		return telefone.length() == 8;
	}
	
	public boolean isCompleto() {
		return this.codigo != 0 && 
				this.nome != "" && 
				this.endereco != "" && 
				this.email != "" && 
				this.telefone != "" && 
				this.observacao != "";
	}
	
	public Contato(int codigo) throws Error {
		if (!this.isCodigo(codigo)) {
			throw new Error("Codigo invalido");
		}
		
		this.codigo = codigo;
		this.nome = "";
		this.endereco = "";
		this.email = "" ;
		this.telefone= "" ;
		this.observacao = "";
	}
	
	public Contato(int codigo, String nome) throws Error {
		if (!this.isCodigo(codigo)) {
			throw new Error("Codigo invalido");
		}
		
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = "";
		this.email = "" ;
		this.telefone= "" ;
		this.observacao = "";
	}
	
	public Contato(int codigo, String nome, String email) throws Error {
		if (!this.isCodigo(codigo)) {
			throw new Error("Codigo invalido");
		}
		
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;		
		this.endereco = "";
		this.telefone= "" ;
		this.observacao = "";
	}
	
	public Contato(String telefone) throws Error {
		if (!this.isTelefone(telefone)) {
			throw new Error("Telefone invalido");
		}
		
		this.telefone = telefone;
		this.codigo = 0;
		this.nome = "";
		this.endereco = "";
		this.email = "";
		this.observacao = "";
	}
	
	public void setTelefone(String telefone) throws Error {
		if (!this.isTelefone(telefone)) {
			throw new Error("Telefone invalido");
		}
		
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		String info = "";
		
		info += "Codigo: " + this.codigo + ";";
		info += "Nome: " + this.nome + ";";
		info += "Endereco: " + this.endereco + ";";
		info += "E-mail: " + this.email + ";";
		info += "Telefone: " + this.telefone + ";";
		info += "Observacao: " + this.observacao + ";";
		
		return info;
	}
	
	public Contato clone() {
		Contato contatoClonado = new Contato(this.codigo, this.nome, this.email);
		contatoClonado.setTelefone(this.telefone);
		
		return contatoClonado;
	}
	
}
