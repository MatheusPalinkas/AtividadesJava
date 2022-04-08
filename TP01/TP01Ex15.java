package TP01;
import java.util.Scanner;

/**
 * @author Jo�o Paulo, Mateus Palinkas.
 * 
 * 15. Entrar via teclado com o valor da cota��o do d�lar e uma certa
 * quantidade de d�lares. Calcular e exibir o valor correspondente em
 * Reais (R$).
 */
public class TP01Ex15 {

	public static void main(String[] args) {
		double cotacao, quantiaDolares, quantiaReais;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a cota��o atual: ");
		cotacao = scan.nextDouble();

		System.out.print("Entre com a quantia em d�lares: ");
		quantiaDolares = scan.nextDouble();

		quantiaReais = quantiaDolares / cotacao;

		System.out.println("A quantia em Reais �: " + quantiaReais);
	}

}
