package questoes;

public class Questao04 {

    private final double[] faturamentos;
    private final String[] estados;
    
    public Questao04() {
        // Faturamento por estado
        estados = new String[]{"SP", "RJ", "MG", "ES", "Outros"};
        faturamentos = new double[]{67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
    }
    
    public void calcularPercentuais() {
        double faturamentoTotal = calcularFaturamentoTotal();
        System.out.println("Faturamento Total: R$ " + String.format("%.2f", faturamentoTotal));

        for (int i = 0; i < estados.length; i++) {
            double percentual = (faturamentos[i] / faturamentoTotal) * 100;
            System.out.println(estados[i] + ": " + String.format("%.2f", percentual) + "%");
        }
    }

    private double calcularFaturamentoTotal() {
        double total = 0;
        for (double faturamento : faturamentos) {
            total += faturamento;
        }
        return total;
    }
}