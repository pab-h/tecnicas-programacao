package controle;

import java.util.ArrayList;

import persistencia.RelatorioVirtualDAO;

public class RelatorioVirtual {

	private String[] campos;
	private ArrayList<String[]> dados;
	
	public RelatorioVirtual() {
		
		String[] campos = { 
			"Jogador", 
			"Rodadas", 
			"Células Vazias", 
			"Pontuação", 
			"Alunos", 
			"Bugs", 
			"Vermelho", 
			"Preto", 
			"Azul"
		};
		this.campos = campos;
		
		this.dados = new ArrayList<String[]>();
		
		this.recuperarDados();
		
	}
	
	public String[] getCampos() {
		return this.campos;
	}
	
	public ArrayList<String[]> getDados() {
		return this.dados;
	}

	public void recuperarDados() {
		RelatorioVirtualDAO relatorioVirtualDAO = new RelatorioVirtualDAO();
		this.dados = relatorioVirtualDAO.recuperar();
		
	}
	
	public void atualizar(Gerenciador gerenciador) {
		RelatorioVirtualDAO relatorioVirtualDAO = new RelatorioVirtualDAO();
		relatorioVirtualDAO.atualizar(gerenciador);
	}
	
}
