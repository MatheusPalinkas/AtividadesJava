package TP01;
import java.util.Scanner;

/**
 * @author Jo�o Paulo, Mateus Palinkas.
 * 
 * 2.Calcular e exibir a �rea de um quadrado, a partir do valor de sua
 * aresta que ser� digitado.
 */

public class TP01Ex02 {

	public static void main(String[] args) {
		float area, lado;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a medida do lado do quadrado: ");
		lado = scan.nextFloat();

		area = lado * lado;

		System.out.println("A area do quadrado �: " + area);
	}

}
