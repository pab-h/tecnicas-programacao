package apresentacao;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Icone {

	private String caminho;
	
	public Icone(String caminho) {
		this.caminho = caminho;
	}
	
	public ImageIcon getIcon(int largura, int altura) {
		
		ImageIcon tmp = new ImageIcon(this.caminho);
		
		Image imagem = tmp.getImage();
		
		Image novaImagem = imagem.getScaledInstance(
			largura, 
			altura, 
			Image.SCALE_SMOOTH
		);
		
		return new ImageIcon(novaImagem);
	}
	
}
