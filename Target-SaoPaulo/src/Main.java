import java.util.Scanner;

import questoes.Questao01;
import questoes.Questao02;
import questoes.Questao03;
import questoes.Questao04;
import questoes.Questao05;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * QUESTAO 01
		 */
		/*
		 * int indice = 13;
		 * 
		 * Questao01 calculadora = new Questao01(indice);
		 * 
		 * int resultado = calculadora.calcularSoma();
		 * 
		 * System.out.println("O valor da variavel SOMA é: "+resultado);
		 */

		/*
		 * QUESTAO 02
		 */
		/*
		 * Questao02 q02 = new Questao02();
		 * 
		 * System.out.
		 * print("Digite um número para verificar se ele está na sequência de Fibonacci: "
		 * ); int num = scanner.nextInt();
		 * 
		 * if (q02.eFibonacci(num)) { System.out.println(num +
		 * " pertence à sequência de Fibonacci."); } else { System.out.println(num +
		 * " não pertence à sequência de Fibonacci."); }
		 * 
		 * scanner.close();
		 */

		/*
		 * QUESTAO 03
		 */
		/*
		 try {
	           
	            String xmlFilePath = "faturamento.xml";
	            
	            Questao03 faturamento = new Questao03(xmlFilePath);
	            
	            System.out.println("Menor valor de faturamento: R$ " + faturamento.getMenorValor());
	            System.out.println("Maior valor de faturamento: R$ " + faturamento.getMaiorValor());
	            System.out.println("Número de dias com faturamento acima da média: " + faturamento.contarDiasAcimaDaMedia());
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    */
		
		/*
		 * QUESTAO 04
		 */
		/*
		Questao04 distribuidora = new Questao04();
        distribuidora.calcularPercentuais();
        */
		
		/*
		 *  QUESTAO 05
		 */
		
		// Solicita ao usuário para inserir uma string
        System.out.print("Digite a string para inverter: ");
        String entrada = scanner.nextLine();
        
        // Usa a classe StringInverter para inverter a string
        String resultado = Questao05.inverter(entrada);
        
        // Exibe a string invertida
        System.out.println("String invertida: " + resultado);
        
        // Fecha o scanner
        scanner.close();
		
	}	
}