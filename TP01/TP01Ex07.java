import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão 
 * digitados.
 */
public class TP01Ex07 {

	public static void main(String[] args) {
		double volume, valor1, valor2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o 1º valor: ");
		valor1 = scan.nextDouble();
		
		System.out.print("Entre com o 2º valor: ");
		valor2 = scan.nextDouble();

		
		volume = Math.sqrt(valor1 * valor2);

		System.out.println("A area do quadrado é: " + volume);
	}

}
