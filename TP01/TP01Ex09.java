package TP01;
import java.util.Scanner;

/**
 * @author Jo�o Paulo, Mateus Palinkas.
 * 
 * 9.Calcular e exibir a tens�o de um determinado circuito eletr�nico a
 * partir dos valores da resist�ncia e corrente el�trica que ser�o
 * digitados. Utilize a lei de Ohm.
 */
public class TP01Ex09 {

	public static void main(String[] args) {
		double resistencia, corrente, tensao;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o valor da resistencia: ");
		resistencia = scan.nextDouble();

		System.out.print("Entre com o valor da corrente: ");
		corrente = scan.nextDouble();

		tensao = resistencia * corrente;

		System.out.println("A tens�o do circuito �: " + tensao);
	}

}
