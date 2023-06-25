package apresentacao;

import javax.swing.JFrame;

public class Tela extends JFrame {

	public Tela() {
		this.setTitle("Aspiradores ao resgate!");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
