package apresentacao.conteudos;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Listar extends JPanel {
	
	public Listar() {
		this.setLayout(new FlowLayout());
		
		String[][] dados = {};
		
		String[] campos = { "nome", "cpf", "matricula", "vertente" };
		
        DefaultTableModel tabelaModel = new DefaultTableModel(
			dados, 
			campos
        );
        
        JTable tabela = new JTable(tabelaModel);
        
        JScrollPane tabelaScrolavel = new JScrollPane(tabela);
        
        for(int i = 0; i < 100; i++) {
        	
            Object[] linha = {
            		"Ryam - " + Integer.toString(i), "123.123.123-14", "123987", "CC" };
        	
        	tabelaModel.addRow(linha);        	
        }
        
		
		this.add(tabelaScrolavel);
		
	}
	
}
