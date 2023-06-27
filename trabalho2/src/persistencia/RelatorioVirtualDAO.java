package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import controle.Gerenciador;

public class RelatorioVirtualDAO {

	private String caminho;
	
	public RelatorioVirtualDAO() {
		this.caminho = "./relatorio.csv";
	}
	
	public ArrayList<String[]> recuperar() {
		ArrayList<String[]> dados = new ArrayList<String[]>();
		
       try (BufferedReader leitor = new BufferedReader(new FileReader(this.caminho))) {
    	   
            String linha = "";
            while ((linha = leitor.readLine()) != null) {
            	String[] colunas = linha.split(";");
            	dados.add(colunas);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return dados;
	}
	
	public void atualizar(Gerenciador gerenciador) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(this.caminho, true))) {
        	escritor.write(
        		gerenciador.getJogador().getNome() + ";" +
        		gerenciador.getRodadas() + ";" +
        		gerenciador.getTotalCelulasVazias() + ";"+
        		gerenciador.getPontuacaoTotal() + ";" +
        		gerenciador.getTotalAlunosEncontrados() + ";" +
        		gerenciador.getTotalPoeirasEncontradas() + ";" +
        		gerenciador.getAspiradoresVirtuais().get(0).getPontuacao() + ";" +
        		gerenciador.getAspiradoresVirtuais().get(1).getPontuacao() + ";" +
        		gerenciador.getAspiradoresVirtuais().get(2).getPontuacao() + ";" 
        		+"\n"
			);
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}
