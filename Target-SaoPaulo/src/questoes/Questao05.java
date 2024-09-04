package questoes;

public class Questao05 {

    // Método para inverter a string
    public static String inverter(String original) {
        // Converte a string em um array de caracteres
        char[] caracteres = original.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        // Inverte os caracteres no array
        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            esquerda++;
            direita--;
        }

        // Converte o array de volta para uma string e retorna
        return new String(caracteres);
    }
}