import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 
 * 11.A partir do diâmetro de um círculo que será digitado, calcular e
 * exibir sua área.
 */
public class TP01Ex13 {

	public static void main(String[] args) {
		final double CONSTANTE_MS_PARA_KH = 3.6;
		
		double velocidadeFinalKh ,velocidadeInicial, aceleracao, tempo;
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a velocidade inicial: ");
		velocidadeInicial = scan.nextDouble();

		System.out.print("Entre com a aceleracao: ");
		aceleracao = scan.nextDouble();
		
		System.out.print("Entre com o tempo: ");
		tempo = scan.nextDouble();
		
		velocidadeFinalKh = (velocidadeInicial + (aceleracao * tempo)) * CONSTANTE_MS_PARA_KH;

		System.out.println("A velocidade final em kilometros por hora é: " + velocidadeFinalKh);
	}

}
