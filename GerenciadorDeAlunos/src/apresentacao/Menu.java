package apresentacao;

import javax.swing.JPanel;

import apresentacao.eventos.ActionClickAtualizar;
import apresentacao.eventos.ActionClickCadastrar;
import apresentacao.eventos.ActionClickDeletar;
import apresentacao.eventos.ActionClickListar;

import javax.swing.JButton;

import java.awt.FlowLayout;

public class Menu extends JPanel {
	
	private Conteudo conteudo;
	
	public Menu(Conteudo conteudo) {
		super();
		
		this.conteudo = conteudo;
		
		this.setLayout(new FlowLayout());
		
		JButton cadastrarButton = new JButton("cadastrar");
		
		cadastrarButton.addActionListener(new ActionClickCadastrar(this.conteudo));
		
		this.add(cadastrarButton);
		
		
		JButton listarButton = new JButton("listar");
		
		listarButton.addActionListener(new ActionClickListar(this.conteudo));
		
		this.add(listarButton);

		
		JButton atualizarButton = new JButton("atualizar");
		
		atualizarButton.addActionListener(new ActionClickAtualizar(this.conteudo));
		
		this.add(atualizarButton);
		
		
		JButton deletarButton = new JButton("deletar");
		
		deletarButton.addActionListener(new ActionClickDeletar(this.conteudo));
		
		this.add(deletarButton);
		
	}
	
}
