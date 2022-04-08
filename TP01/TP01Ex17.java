
import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 
 * 17.Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). 
 * Pesquisar as funções Exp e Ln.
 */
public class TP01Ex17 {

	public static void main(String[] args) {
		double x, y, resultado;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o valor x (base): ");
		x = scan.nextDouble();

		System.out.print("Entre com o valor y (expoente): ");
		y = scan.nextDouble();

		resultado = Math.pow(x, y);

		System.out.println("O resultado da potencição é: " + resultado);
	}

}