import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
 */

public class TP01Ex06 {
    
    public static void main(String[] args){
        float valor1, valor2, valor3, valor4, media;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com o 1º valor: ");
    	valor1 = scan.nextFloat();

		System.out.print("Entre com o 2º valor: ");
    	valor2 = scan.nextFloat();

		System.out.print("Entre com o 3º valor: ");
    	valor3 = scan.nextFloat();

		System.out.print("Entre com o 4º valor: ");
    	valor4 = scan.nextFloat();
    	
    	media = (valor1 + valor2 + valor3 + valor4) / 4;
    	
    	System.out.println("A média dos numeros digitado é " + media);
    }
}