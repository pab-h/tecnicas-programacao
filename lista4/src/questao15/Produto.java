package questao15;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double despesas;
    private double margemLucro;

    public Produto(String nome, double precoCusto, double precoVenda, double despesas) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.despesas = despesas;
    }

    public double calculaMargemLucro() {
        this.margemLucro = ((this.precoVenda - (this.precoCusto + this.despesas)) / this.precoVenda) * 100;
        return this.margemLucro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o preço de custo: ");
        double precoCusto = scanner.nextDouble();
        System.out.print("Informe o preço de venda: ");
        double precoVenda = scanner.nextDouble();
        System.out.print("Informe as despesas da empresa: ");
        double despesas = scanner.nextDouble();

        Produto produto = new Produto(nome, precoCusto, precoVenda, despesas);
        double margemLucro = produto.calculaMargemLucro();
        System.out.printf("A margem de lucro do produto %s é de %.2f%%.", nome, margemLucro);
    }
}
