import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 
 * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a
 * partir dos valores da velocidade inicial (em m/s), da aceleração
 * (m/s2) e do tempo de percurso (em s) que serão digitados.
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
