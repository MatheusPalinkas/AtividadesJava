import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
r inscrita em um cubo perfeito de aresta a. Os valores de r e a serão
digitados.
 */

public class TP01Ex14 {
    
    public static void main(String[] args){
        double raioEsfera, arestaCubo;
		double volumeEsfera, volumeCubo, volumeLivre;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com o raio da esfera: ");
    	raioEsfera = scan.nextFloat();

		System.out.print("Entre com a aresta do cubo: ");
    	arestaCubo = scan.nextFloat();
    	
		volumeCubo = Math.pow(arestaCubo, 3);
		volumeEsfera = (4 * Math.PI * Math.pow(raioEsfera, 3))/ 3;
    	volumeLivre = volumeCubo - volumeEsfera;

    	System.out.println("O volume livre é " + volumeLivre);
    }
}