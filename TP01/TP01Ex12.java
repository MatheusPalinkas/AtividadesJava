import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
 */

public class TP01Ex12 {
    
    public static void main(String[] args){
        double altura, raio, volume;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com a altura de um cone: ");
    	altura = scan.nextFloat();
    	
    	System.out.print("Entre com raio da base de um cone: ");
    	raio = scan.nextFloat();
    	
    	volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
    	
    	System.out.println("O volume do cone é " + volume);
    }
}