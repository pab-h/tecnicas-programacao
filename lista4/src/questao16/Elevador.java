package questao16;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        } else {
            System.out.println("Não é possível entrar no elevador, capacidade máxima atingida.");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        } else {
            System.out.println("Não há ninguém no elevador para sair.");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Não é possível subir mais, você já está no último andar.");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Não é possível descer mais, você já está no térreo.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
