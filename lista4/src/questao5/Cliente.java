package questao5;

public class Cliente {
	private String nome; 
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getContatinhos() {
		Agenda agenda = new Agenda("Agenda - " + this.nome, "");
		
		agenda.adicionaContato(new Contato(1001, "Policia", "policia@gmail.com"));
		agenda.adicionaContato(new Contato(1002, "Samu", "samu@gmail.com"));
		
		return agenda.toString();
	}
	
	public String getNome() {
		return this.nome;
	}
	
}
