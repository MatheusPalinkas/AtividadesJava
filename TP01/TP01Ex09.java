import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 
 * 9.Calcular e exibir a tensão de um determinado circuito eletrônico a
 * partir dos valores da resistência e corrente elétrica que serão
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

		System.out.println("A tensão do circuito é: " + tensao);
	}

}
