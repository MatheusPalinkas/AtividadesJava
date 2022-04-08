import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 
 * 11.A partir do diâmetro de um círculo que será digitado, calcular e
 * exibir sua área.
 */
public class TP01Ex11 {

	public static void main(String[] args) {
		double raio ,area;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a medida do raio: ");
		raio = scan.nextDouble();

		area = Math.PI * Math.pow(raio, 2);

		System.out.println("A area do circulo é: " + area);
	}

}