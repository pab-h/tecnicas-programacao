package apresentacao.conteudos;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

public class Listar extends JPanel {
	
	public Listar() {
		this.setLayout(new GridLayout(1, 1));
		
		String[][] dados = {{ "Nome", "CPF", "Matrícula", "Vertente" }};
		
		String[] campos = { "nome", "cpf", "matricula", "vertente" };
		
        DefaultTableModel tableModel = new DefaultTableModel(
			dados, 
			campos
        );
		
		this.add(new JTable(tableModel));
		
	}
	
}
