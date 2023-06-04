package apresentacao;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {
	
	private Conteudo conteudo;
	
	public Menu(Conteudo conteudo) {
		super();
		
		this.conteudo = conteudo;
		
		this.setLayout(new FlowLayout());
		
		JButton cadastrarButton = new JButton("cadastrar");
		
		cadastrarButton.addActionListener(new ActionClickCadastrar());
		
		this.add(cadastrarButton);
		
		
		this.add(new JButton("listar"));

		
		JButton atualizarButton = new JButton("atualizar");
		
		atualizarButton.addActionListener(new ActionClickAtualizar());
		
		this.add(atualizarButton);
		
		
		JButton deletarButton = new JButton("deletar");
		
		deletarButton.addActionListener(new ActionClickDeletar());
		
		this.add(deletarButton);
		
	}
	
	
	private class ActionClickCadastrar implements ActionListener {
		
		public void actionPerformed(ActionEvent evento) {
			conteudo.setConteudoCadastrar();
		}
		
	}
	
	private class ActionClickAtualizar implements ActionListener {
		
		public void actionPerformed(ActionEvent evento) {
			conteudo.setConteudoAtualizar();
		}
		
	}
	
	private class ActionClickDeletar implements ActionListener {
		
		public void actionPerformed(ActionEvent evento) {
			conteudo.setConteudoDeletar();
		}
		
	}
	
}
