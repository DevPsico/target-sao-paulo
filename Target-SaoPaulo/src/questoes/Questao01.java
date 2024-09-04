package questoes;
public class Questao01 {
    private int indice;

    // Construtor para inicializar o índice
    public Questao01(int indice) {
        this.indice = indice;
    }

    // Método para calcular a soma
    public int calcularSoma() {
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        return soma;
    }
}