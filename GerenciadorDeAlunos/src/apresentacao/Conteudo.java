package apresentacao;

import javax.swing.JPanel;

import apresentacao.conteudos.Atualizar;
import apresentacao.conteudos.Cadastrar;

public class Conteudo extends JPanel {
	
	public void setConteudoCadastrar() {
		this.removeAll();
		this.add(new Cadastrar());
		this.revalidate(); 
		this.repaint();
	}
	
	public void setConteudoAtualizar() {
		this.removeAll();
		this.add(new Atualizar());
		this.revalidate(); 
		this.repaint();
	}
	
}
