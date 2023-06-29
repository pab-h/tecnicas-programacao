package apresentacao;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controle.Gerenciador;
import controle.RelatorioVirtual;

public class Relatorio extends JPanel {
	
	public Relatorio(Gerenciador gerenciador) {
		this.setLayout(new FlowLayout());
		
		RelatorioVirtual relatorioVirtual = new RelatorioVirtual();

		ArrayList<String[]> dados = relatorioVirtual.getDados();
		
		String[] campos = relatorioVirtual.getCampos();
		Object[][] _dados = {};
		
        DefaultTableModel tabelaModel = new DefaultTableModel(
    		_dados, 
			campos
        );
        
        JTable tabela = new JTable(tabelaModel);
        
        JScrollPane tabelaScrolavel = new JScrollPane(tabela);
        
        for(String[] linha: dados) {
        	tabelaModel.addRow(linha);
        }
        
        this.add(tabelaScrolavel);
        
		this.setVisible(true);
	}
	
}
