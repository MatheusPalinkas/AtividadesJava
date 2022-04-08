package TP01;
import java.util.Scanner;

/**
 * @author Jo�o Paulo, Mateus Palinkas.
 * 
 * 7. Calcular e exibir a m�dia geom�trica de dois valores quaisquer que
 * ser�o digitados.
 */
public class TP01Ex07 {

	public static void main(String[] args) {
		double volume, valor1, valor2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o 1� valor: ");
		valor1 = scan.nextDouble();
		
		System.out.print("Entre com o 2� valor: ");
		valor2 = scan.nextDouble();

		
		volume = Math.sqrt(valor1 * valor2);

		System.out.println("A area do quadrado �: " + volume);
	}

}
