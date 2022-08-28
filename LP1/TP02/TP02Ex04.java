import java.util.Scanner;

/**
 * @author Jo�o Paulo e Matheus Palinkas
 * 
 *         4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os
 *         valores na tela.
 */
public class TP02Ex04 {
	public static void main(String[] args) {
		int[][] numeros = new int[2][3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print("Entre com um valor: ");
				numeros[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
        scan.close();
	}
}
