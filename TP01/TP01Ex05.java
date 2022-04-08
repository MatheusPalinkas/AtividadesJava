package TP01;
import java.util.Scanner;

/**
 * @author Jo�o Paulo, Mateus Palinkas.
 * 
 * 5.Calcular e exibir o volume de uma esfera a partir do valor de seu
 * di�metro que ser� digitado.
 */
public class TP01Ex05 {

	public static void main(String[] args) {
		double volume, diametro;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a medida do diametro da esfera: ");
		diametro = scan.nextDouble();

		//volume = 4 / 3 * pi * raio
		volume = (4 / 3) * Math.PI * (diametro / 2);

		System.out.println("A area do quadrado �: " + volume);
	}

}
