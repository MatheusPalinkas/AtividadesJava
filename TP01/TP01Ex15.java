import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 
 * 15. Entrar via teclado com o valor da cotação do dólar e uma certa
 * quantidade de dólares. Calcular e exibir o valor correspondente em
 * Reais (R$).
 */
public class TP01Ex15 {

	public static void main(String[] args) {
		double cotacao, quantiaDolares, quantiaReais;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a cotação atual: ");
		cotacao = scan.nextDouble();

		System.out.print("Entre com a quantia em dólares: ");
		quantiaDolares = scan.nextDouble();

		quantiaReais = quantiaDolares / cotacao;

		System.out.println("A quantia em Reais é: " + quantiaReais);
	}

}
