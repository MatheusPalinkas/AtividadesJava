import java.util.Scanner;

/**
 * @author Jo�o Paulo e Matheus Palinkas
 * 
 *         2. Entrar via teclado com dez valores positivos. Consistir a
 *         digita��o e enviar mensagem de erro, se necess�rio. Ap�s a digita��o,
 *         exibir: a. O maior valor; b. A soma dos valores; c. A m�dia
 *         aritm�tica dos valores.
 */
public class TP02Ex02 {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		float maiorNumero = 0, soma = 0, media;
		
		Scanner scan = new Scanner(System.in);
 
		for (int i = 0; i < 10; i++) {
			do {
				System.out.print("Entre com um valor positivo: ");
				numeros[i] = scan.nextInt();
				
				if (numeros[i] <= 0) {
					System.out.println("O valor que você digitou não era positivo");
				} 
			} while (numeros[i] <= 0);
			
			soma = soma + numeros[i];
			
			if(numeros[i]>maiorNumero) {
				maiorNumero = numeros[i];
			}
			
		}
		
		media = soma / 10;

		System.out.println("O maior numero digitado foi: "+ maiorNumero);

		System.out.println("A soma dos valores digitados é: "+ soma);

		System.out.println("A média dos valores digitados é: " + media);

		scan.close();
	}
}
